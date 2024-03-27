package com.springboot.jpa.tutorial.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.jpa.tutorial.entity.CourseMaterial;

public interface CourseMaterialRepository extends JpaRepository<CourseMaterial, Long>{

}
