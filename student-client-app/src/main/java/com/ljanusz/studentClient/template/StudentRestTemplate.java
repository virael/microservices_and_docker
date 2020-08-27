package com.ljanusz.studentClient.template;

import com.ljanusz.studentClient.domain.Student;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class StudentRestTemplate {

    @Value("${baseStudentUrl}")
    private String baseStudentUrl;

    @GetMapping("/getStudents")
    public Student[] get() {

        final RestTemplate restTemplate = new RestTemplate();

        final ResponseEntity<Student[]> exchange = restTemplate.exchange(
                baseStudentUrl,
                HttpMethod.GET,
                HttpEntity.EMPTY,
                Student[].class);

        return exchange.getBody();
    }

}
