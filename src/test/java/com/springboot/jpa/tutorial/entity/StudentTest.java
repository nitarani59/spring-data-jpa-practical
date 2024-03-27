package com.springboot.jpa.tutorial.entity;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.springboot.jpa.tutorial.repository.StudentRepository;

@SpringBootTest
public class StudentTest {

    @Autowired
    private StudentRepository studentRepository;

    // Test
    @Test
    void testStudentRepository() {
        Student student = Student.builder()
        .name("Nita")
        .emailId("nita@gmail.com")
        .guardian(Guardian.builder().name("guardian1").email("guardian@gmail.com").build())
        .build();
        studentRepository.save(student);
    }
}
