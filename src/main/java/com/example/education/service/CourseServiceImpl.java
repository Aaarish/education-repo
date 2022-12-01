package com.example.education.service;

import com.example.education.entity.Course;
import com.example.education.repository.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CourseServiceImpl implements CourseService{

    @Autowired
    private CourseRepo courseRepo;

    @Override
    public Long addCourse(Course course) {
        Course course1 = courseRepo.save(course);
        return course1.getCourseId();
    }

    @Override
    public Course getCourse(Long id) {
        return courseRepo.getCourse(id);
    }
}
