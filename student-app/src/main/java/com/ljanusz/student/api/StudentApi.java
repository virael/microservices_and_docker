package com.ljanusz.student.api;

import com.ljanusz.student.domain.Student;
import com.ljanusz.student.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentApi {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentApi(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @GetMapping("/students")
    public Iterable<Student> getStudents() {
        return studentRepository.findAll();
    }

    @PostMapping("/students")
    public void addStudent(@RequestBody Student student) {
        studentRepository.save(student);
    }

}