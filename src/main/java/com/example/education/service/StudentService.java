package com.example.education.service;

import com.example.education.entity.Student;
import org.springframework.stereotype.Service;

public interface StudentService {
    Long addStudentWithCourse(Student student);

    Student getStudentWithCoursesDetails(Long studentId);
}
