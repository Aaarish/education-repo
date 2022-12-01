package com.example.education.service;

import com.example.education.entity.CourseMaterial;
import com.example.education.repository.CourseMaterialRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseMaterialServiceImpl implements CourseMaterialService {

    @Autowired
    CourseMaterialRepo courseMaterialRepo;

    @Override
    public Long addCourseMaterial(CourseMaterial courseMaterial) {
        CourseMaterial courseMaterial1 = courseMaterialRepo.save(courseMaterial);

        return courseMaterial1.getCourseMaterialId();
    }
}
