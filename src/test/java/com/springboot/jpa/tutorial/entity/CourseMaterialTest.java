package com.springboot.jpa.tutorial.entity;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.springboot.jpa.tutorial.repository.CourseMaterialRepository;

@SpringBootTest
public class CourseMaterialTest {
    
    @Autowired
    private CourseMaterialRepository courseMaterialRepository;

    @Test
    void testBiDirectonalRelationship() {
        List<CourseMaterial> allCourseMaterials = courseMaterialRepository.findAll();
        System.out.println("----------------");
        System.out.println(allCourseMaterials);
    }

}
