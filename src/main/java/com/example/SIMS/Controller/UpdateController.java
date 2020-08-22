package com.example.SIMS.Controller;

import com.example.SIMS.domain.Student;
import com.example.SIMS.service.UpdateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@Controller
public class UpdateController {
    @Autowired
    private UpdateService updateService;


    @RequestMapping(value = "/add/student", method = RequestMethod.POST)
    public String saveStudent(@Valid Student student, Errors errors) {
        if (errors.hasErrors()) {
            return "studentAddForm";
        }
        if (student != null) if (student.isValid()) {
            updateService.save(student);
            return "redirect:/student/list?page=1";
        }
        return "studentAddForm";
    }
}
