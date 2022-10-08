package homework7.service;

import homework7.dao.StudentDao;
import homework7.entity.Student;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class StudentService {

    private final StudentDao studentDao;

    public Student save(Student student) {
        if (student.getId() != null) {
            Optional<Student> studentFromDBOptional = studentDao.findById(student.getId());
            if (studentFromDBOptional.isPresent()) {
                Student studentFromDB = studentFromDBOptional.get();
                studentFromDB.setName(student.getName());
                studentFromDB.setAge(student.getAge());
                return studentDao.save(studentFromDB);
            }
        }
        return studentDao.save(student);
    }

    @Transactional(readOnly = true)
    public Student findById(Long id) {
        return studentDao.findById(id).orElse(null);
    }

    public List<Student> findAll() {
        return studentDao.findAll();
    }

    public void deleteById(Long id) {
        try {
            studentDao.deleteById(id);
        } catch (EmptyResultDataAccessException e) {
            log.error(e.getMessage());
        }
    }
}
