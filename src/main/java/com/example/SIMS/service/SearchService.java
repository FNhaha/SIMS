package com.example.SIMS.service;

import com.example.SIMS.dao.StudentRepository;
import com.example.SIMS.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class SearchService {
    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getStudentListByPage(int page) {
        Pageable pageable = PageRequest.of(page - 1, 50);
        return studentRepository.findAll(pageable).getContent();
    }
}
