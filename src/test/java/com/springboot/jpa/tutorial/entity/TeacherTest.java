package com.springboot.jpa.tutorial.entity;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.springboot.jpa.tutorial.repository.TeacherRepository;

@SpringBootTest
public class TeacherTest {

    @Autowired
    private TeacherRepository teacherRepository;

    // Test
    @Test
    void testStudentRepository() {
        Teacher teacher = Teacher.builder()
        .teacherName("Nita")
        .courses(List.of(Course.builder().courseName("name2").courseMaterial(new CourseMaterial()).build()))
        .build();
        teacherRepository.save(teacher);
    }
}
