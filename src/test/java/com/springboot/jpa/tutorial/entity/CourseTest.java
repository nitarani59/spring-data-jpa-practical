package com.springboot.jpa.tutorial.entity;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.List;
import com.springboot.jpa.tutorial.repository.CourseRepository;

@SpringBootTest
public class CourseTest {

    @Autowired
    private CourseRepository courseRepository;

    @Test
    void testCourse() {
        Course course = Course.builder()
        .courseName("COURSE2")
        .courseMaterial(CourseMaterial.builder().material("courseMaterial1").build())
        .build();

        courseRepository.save(course);
    }

    @Test
    void testFetchType() {
        List<Course> allCourse = courseRepository.findAll();
        System.out.println("----------------");
        System.out.println(allCourse);
    }
}
