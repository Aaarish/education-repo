package com.example.education.repository;

import com.example.education.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepo extends JpaRepository<Course, Long> {

    @Query(value = "SELECT * FROM courses WHERE course_id = :course_id", nativeQuery = true)
    Course getCourse(@Param("course_id") Long id);
}
