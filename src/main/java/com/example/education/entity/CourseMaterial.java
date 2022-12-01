package com.example.education.entity;

import lombok.Data;
import org.springframework.cache.interceptor.CacheAspectSupport;

import javax.persistence.*;

@Entity(name = "coursematerial")
@Data
public class CourseMaterial {
    @Id
    @SequenceGenerator(name = "coursematerial_sequence", sequenceName = "coursematerial_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "coursematerial_sequence")
    private Long courseMaterialId;
    private String courseMaterialName;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "course_id", referencedColumnName = "courseId")
    private Course course;
}
