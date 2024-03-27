package com.springboot.jpa.tutorial.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.jpa.tutorial.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{
    
}
