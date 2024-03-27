package com.springboot.jpa.tutorial.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
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

public class Course {

    @Id
    @SequenceGenerator(name = "course_seq", sequenceName = "course_seq")
    @GeneratedValue(generator = "course_seq", strategy = GenerationType.SEQUENCE)
    private Long id;
    private String courseName;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "course_mat_id", referencedColumnName = "id")
    private CourseMaterial courseMaterial;

    // @ManyToOne(optional = false, cascade = CascadeType.ALL)
    // @JoinColumn(name = "teacher_id", referencedColumnName = "teacherId")
    // private Teacher teacher;
}
