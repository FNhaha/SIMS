package com.example.SIMS.service;

import com.example.SIMS.dao.ClassRepository;
import com.example.SIMS.dao.CourseRepository;
import com.example.SIMS.dao.StudentRepository;
import com.example.SIMS.domain.Course;
import com.example.SIMS.domain.Student;
import com.example.SIMS.domain.Class;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UpdateService {
    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private ClassRepository classRepository;

    @Autowired
    private CourseRepository courseRepository;


    public Student save(Student student) {
        return studentRepository.save(student);
    }
    public Class save(Class _class) {
        return classRepository.save(_class);
    }
    public Course save(Course course) {
        return courseRepository.save(course);
    }
}
