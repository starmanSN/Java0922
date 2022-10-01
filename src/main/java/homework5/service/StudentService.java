//package homework5.service;
//
//import homework5.dao.StudentDao;
//import homework5.entity.Student;
//import lombok.RequiredArgsConstructor;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import java.util.List;
//import java.util.NoSuchElementException;
//
//@Service
//@RequiredArgsConstructor
//@Transactional
//@Component
//public class StudentService {
//
//    @Autowired
//    public StudentDao studentDao;
//
//    public Student save(Student student) {
//        return studentDao.save(student);
//    }
//
//    @Transactional(readOnly = true)
//    public Student findById(Long id) {
//        return studentDao.findById(id).orElseThrow(NoSuchElementException::new);
//    }
//
//    public List<Student> findAll() {
//        return studentDao.findAll();
//    }
//
//}
