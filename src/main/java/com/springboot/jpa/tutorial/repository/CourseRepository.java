package com.springboot.jpa.tutorial.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.jpa.tutorial.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Long>{
    
}
