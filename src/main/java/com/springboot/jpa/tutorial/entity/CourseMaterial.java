package com.springboot.jpa.tutorial.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class CourseMaterial {
    
    @Id
    @SequenceGenerator(
        name = "course_mat_seq",
        sequenceName = "course_mat_seq"
    )
    @GeneratedValue(generator = "course_mat_seq", strategy = GenerationType.SEQUENCE)
    private Long id;
    private String material;
}
