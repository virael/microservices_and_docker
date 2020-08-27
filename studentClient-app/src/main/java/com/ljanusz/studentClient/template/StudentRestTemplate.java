package com.ljanusz.studentClient.template;

import com.ljanusz.studentClient.domain.Student;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class StudentRestTemplate {

    @GetMapping("/getStudents")
    public Student[] get() {

        final RestTemplate restTemplate = new RestTemplate();

        final String url = "http://172.19.0.2:8080/students";

        final ResponseEntity<Student[]> exchange = restTemplate.exchange(
                url,
                HttpMethod.GET,
                HttpEntity.EMPTY,
                Student[].class);

        return exchange.getBody();

    }

}
