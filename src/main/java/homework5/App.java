package homework5;

import homework5.config.HibernateConfig;
import homework5.dao.StudentDao;
import homework5.entity.Student;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(HibernateConfig.class);
        StudentDao studentDao = context.getBean(StudentDao.class);

        for (int i = 0; i <= 1000; i++) {
            float a = (float) ((Math.random() * (1 + 4)) + 1);
            Student student = Student.builder()
                    .name("Ivan")
                    .mark(a)
                    .build();
            studentDao.save(student);
        }

        System.out.println(studentDao.findById(1L));
        studentDao.deleteById(1L);
        System.out.println(studentDao.findAll());
    }
}
