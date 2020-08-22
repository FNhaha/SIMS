package com.example.SIMS.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.sql.Date;

@Entity
@Getter
@Setter
public class Student {
    @Id
    @Size(min = 9, max = 9, message = "{id.size}")
    @NotNull
    private Long id;

    @Column(name = "name", nullable = false)
    @Size(min = 1, max = 10, message = "{name.size}")
    @NotNull
    private String name;

    @Column(name = "password", nullable = true)
    private String password;

    @Column(name = "sex", nullable = false)
    @Size(min = 1, max = 1, message = "{sex.size}")
    @NotNull
    private String sex;

    @Column(name = "birth", nullable = false)
    private String birth;

    @Column(name = "classId", nullable = true)
    @Size(min = 1, max = 15, message = "{classId.size}")
    @NotNull
    private Long classId;

    public boolean isValid() {
        return (id != null) && (id.toString().length()==9)
                && (name != null) && (name.length()>0 && name.length()<11)
                && (sex != null) && (sex.length()==1)
                && (birth != null) && (birth.length()!=0);
    }
}
