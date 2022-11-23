package com.example.education.controller;

import com.example.education.entity.Student;
import com.example.education.service.StudentServiceImpl;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("students")
public class StudentController {

    @Autowired
    private StudentServiceImpl studentService;


    @PostMapping("")
    public Long addStudentWithCourse(@RequestBody Student student){
        return studentService.addStudentWithCourse(student);
    }

    @GetMapping("{id}")
    public Student getStudentWithCoursesDetails(@PathVariable("id") Long studentId){
        return studentService.getStudentWithCoursesDetails(studentId);
    }
}
