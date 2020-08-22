package com.example.SIMS.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class StudentCourse {
    @Id
    private Long id;

    @Column(name = "studentId", nullable = false)
    private Long studentId;

    @Column(name = "courseId", nullable = false)
    private Long courseId;

    @Column(name = "score", nullable = true)
    private int score;
}
