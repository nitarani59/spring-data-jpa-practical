package com.springboot.jpa.tutorial.entity;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.springboot.jpa.tutorial.repository.CourseRepository;

@SpringBootTest
public class CourseTest {

    @Autowired
    private CourseRepository courseRepository;

    @Test
    void testCourse() {
        Course course = Course.builder()
        .courseName("COURSE1")
        .courseMaterial(CourseMaterial.builder().material("courseMaterial1")
        .build())
        .build();

        courseRepository.save(course);
    }
}
