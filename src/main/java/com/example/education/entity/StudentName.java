package com.example.education.entity;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
@Data
@NoArgsConstructor
@AttributeOverrides({
        @AttributeOverride(name = "firstName", column = @Column(name = "student_firstname")),
        @AttributeOverride(name = "midName", column = @Column(name = "student_midname")),
        @AttributeOverride(name = "lastName", column = @Column(name = "student_lastname"))
})
public class StudentName {
    private String firstName;
    private String midName;
    private String lastName;
}
