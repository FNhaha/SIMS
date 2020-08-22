package com.example.SIMS.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Class {
    @Id
    private Long id;

    @Column(name = "major", nullable = false)
    private String major;

    @Column(name = "grade", nullable = false)
    private String grade;

    @Column(name = "teacher", nullable = true)
    private String teacher;
}
