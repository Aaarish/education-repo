package com.example.education.controller;

import com.example.education.entity.Course;
import com.example.education.service.CourseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("courses")
public class CourseController {

    @Autowired
    private CourseServiceImpl courseService;

    @PostMapping("")
    public Long addCourse(@RequestBody Course course){
        return courseService.addCourse(course);
    }
}
