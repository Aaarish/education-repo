package com.example.education.service;

import com.example.education.entity.Student;
import com.example.education.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentRepo studentRepo;

    @Override
    public Long addStudentWithCourse(Student student) {
        Student student1 = studentRepo.save(student);
        return student1.getStudentId();
    }

    @Override
    public Student getStudentWithCoursesDetails(Long studentId) {
        Student student = studentRepo.findByStudentId(studentId);
        return student;
    }
}
