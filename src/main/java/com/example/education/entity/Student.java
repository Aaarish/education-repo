package com.example.education.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity(name = "students")
@Data
public class Student {
    @Id
    @SequenceGenerator(name = "student_sequence", sequenceName = "student_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "student_sequence")
    private Long studentId;
    @Embedded
    private StudentName studentName;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "course_id", referencedColumnName = "courseId")
    private Course course;
}
