package com.example.education.service;

import com.example.education.entity.Course;

public interface CourseService {
    Long addCourse(Course course);

    Course getCourse(Long id);
}
