package com.example.SIMS.service;

import com.example.SIMS.dao.ClassRepository;
import com.example.SIMS.dao.CourseRepository;
import com.example.SIMS.dao.StudentRepository;
import com.example.SIMS.domain.Course;
import com.example.SIMS.domain.Student;
import com.example.SIMS.domain.Class;
import com.example.SIMS.domain.StudentInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class SearchService {
    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private ClassRepository classRepository;

    @Autowired
    private CourseRepository courseRepository;

    public List<Student> getStudentListByPage(int page) {
        Pageable pageable = PageRequest.of(page - 1, 50);
        return studentRepository.findAll(pageable).getContent();
    }

    public List<Class> getClassListByPage(int page) {
        Pageable pageable = PageRequest.of(page - 1, 50);
        return classRepository.findAll(pageable).getContent();
    }

    public List<Course> getCourseListByPage(int page) {
        Pageable pageable = PageRequest.of(page - 1, 50);
        return courseRepository.findAll(pageable).getContent();
    }

    public StudentInfoVo getStudentInformation(long studentId) {
        Student student = studentRepository.findById(studentId).get();
        Class _class = null;
        if (student != null) if (student.isValid()) {
            _class = classRepository.findById(student.getClassId()).get();
        }
        if (_class != null) if (_class.isValid()) {
            return new StudentInfoVo(student, _class);
        }
        return null;
    }
}
