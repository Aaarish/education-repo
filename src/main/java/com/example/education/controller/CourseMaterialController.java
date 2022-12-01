package com.example.education.controller;

import com.example.education.entity.CourseMaterial;
import com.example.education.service.CourseMaterialService;
import com.example.education.service.CourseMaterialServiceImpl;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.AttributeOverride;

@RestController
@RequestMapping("coursematerial")
public class CourseMaterialController {

    @Autowired
    CourseMaterialServiceImpl courseMaterialService;

    @PostMapping("")
    public Long addCourseMaterial(@RequestBody CourseMaterial courseMaterial){
        return courseMaterialService.addCourseMaterial(courseMaterial);
    }
}
