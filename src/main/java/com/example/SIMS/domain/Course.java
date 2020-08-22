package com.example.SIMS.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Course {
    @Id
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "credit", nullable = false)
    private int credit;

    @Column(name = "teacher", nullable = true)
    private String teacher;

    @Column(name = "Period", nullable = true)
    private String period;
}
