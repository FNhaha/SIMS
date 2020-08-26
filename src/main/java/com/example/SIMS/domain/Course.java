package com.example.SIMS.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "credit", nullable = false)
    private Integer credit;

    @Column(name = "teacher", nullable = true)
    private String teacher;

    @Column(name = "period", nullable = true)
    private String period;

    @Column(name = "institute", nullable = false)
    private String institute;

    public boolean isValid() {
        return name != null
                && credit != null
                && teacher != null
                && period != null
                && institute != null;
    }
}
