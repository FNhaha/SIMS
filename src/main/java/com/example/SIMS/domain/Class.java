package com.example.SIMS.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Class {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "institute", nullable = false)
    private String institute;

    @Column(name = "major", nullable = false)
    private String major;

    @Column(name = "grade", nullable = false)
    private String grade;

    @Column(name = "teacher", nullable = true)
    private String teacher;

    @Column(name = "name", nullable = false)
    private String name;

    public boolean isValid() {
        return institute != null
                && major != null
                && grade != null
                && name != null;
    }
}
