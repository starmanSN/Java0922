package homework7.dao;

import homework7.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StudentDao extends JpaRepository<Student, Long> {
    Optional<Student> findById(Long id);
}
