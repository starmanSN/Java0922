package homework7.controller;

import homework7.entity.Student;
import homework7.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/student")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @GetMapping("/all")
    public String getStudentList(Model model) {
        model.addAttribute("students", studentService.findAll());
        return "student-list";
    }

    @GetMapping
    public String showForm(Model model, @RequestParam(name = "id", required = false) Long id) {
        Student student;
        if (id != null) {
            student = studentService.findById(id);
        } else {
            student = new Student();
        }
        model.addAttribute("student", student);
        return "student-form";
    }

    @GetMapping("/{studentId}")
    public String showInfo(Model model, @PathVariable(name = "studentId") Long id) {
        Student student;
        if (id != null) {
            student = studentService.findById(id);
        } else {
            return "redirect:/student/all";
        }
        model.addAttribute("student", student);
        return "student-info";
    }

    @PostMapping
    public String saveStudent(Student student) {
        studentService.save(student);
        return "redirect:/student/all";
    }

    @GetMapping("/delete/{id}")
    public String deleteById(@PathVariable(name = "id") Long id) {
        studentService.deleteById(id);
        return "redirect:/student/all";
    }
}
