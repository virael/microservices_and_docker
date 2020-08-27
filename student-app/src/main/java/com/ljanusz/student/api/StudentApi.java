package com.ljanusz.student.api;

import com.ljanusz.student.domain.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentApi {

    private final List<Student> studentList;

    public StudentApi() {
        studentList = new ArrayList<>();
        studentList.add(new Student(0L, "Adam"));
        studentList.add(new Student(1L, "Ewa"));
        studentList.add(new Student(2L, "Andrzej"));
        studentList.add(new Student(3L, "Dawid"));
    }

    @GetMapping("/students")
    public List<Student> getStudents() {
        return studentList;
    }

    @PostMapping("/students")
    public void addStudent(@RequestBody Student student) {
        studentList.add(student);
    }

}