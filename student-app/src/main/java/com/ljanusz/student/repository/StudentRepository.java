package com.ljanusz.student.repository;

import com.ljanusz.student.domain.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Long> {
}
