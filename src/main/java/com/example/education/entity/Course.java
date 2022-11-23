package com.example.education.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity(name = "courses")
@Data
public class Course {
    @Id
    @SequenceGenerator(name = "course_sequence", sequenceName = "course_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "course_sequence")
    private Long courseId;
    private String courseName;
}
