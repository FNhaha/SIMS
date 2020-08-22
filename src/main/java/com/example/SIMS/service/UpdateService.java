package com.example.SIMS.service;

import com.example.SIMS.dao.StudentRepository;
import com.example.SIMS.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UpdateService {
    @Autowired
    private StudentRepository studentRepository;


    public Student save(Student student) {
        return studentRepository.save(student);
    }
}
