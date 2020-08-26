package com.example.SIMS.Controller;

import com.example.SIMS.domain.Student;
import com.example.SIMS.service.UpdateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
@RequestMapping("/add/student")
public class StudentAddFormController {
    @Autowired
    private UpdateService updateService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String getAddStudentPage(Model model) {
        model.addAttribute(new Student());
        return "studentAddForm";
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public String saveStudent(@Valid Student student, Errors errors) {
        if (errors.hasErrors()) {
            return "studentAddForm";
        }
        if (student != null) if (student.isValid()) {
            updateService.save(student);
            return "redirect:/studentList?page=1";
        }
        return "studentAddForm";
    }
}
