package com.example.SIMS.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StudentInfoVo {
    private String name;
    private Long id;
    private String sex;
    private String birth;
    private String institute;
    private String major;
    private String grade;
    private String className;
    private String teacher;

    public StudentInfoVo() {}
    public StudentInfoVo(Student student, Class _class) {
        this.name = student.getName();
        this.id = student.getId();
        this.sex = student.getSex();
        this.birth = student.getBirth();
        this.institute = _class.getInstitute();
        this.major = _class.getMajor();
        this.grade = _class.getGrade();
        this.teacher = _class.getTeacher();
        this.className = _class.getName();
    }

    public static StudentInfoVo buildFailed() {
        StudentInfoVo res = new StudentInfoVo();
        res.setName("发生未知错误");
        return res;
    }
}
