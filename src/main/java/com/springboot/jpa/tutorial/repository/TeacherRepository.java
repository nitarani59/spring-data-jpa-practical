package com.springboot.jpa.tutorial.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.springboot.jpa.tutorial.entity.Teacher;;

public interface TeacherRepository extends JpaRepository<Teacher, Long>{
    
}
