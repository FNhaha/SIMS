package com.example.SIMS.Controller;

import com.example.SIMS.domain.Course;
import com.example.SIMS.service.UpdateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
@RequestMapping("/add/course")
public class CourseAddFormController {
    @Autowired
    private UpdateService updateService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String getAddCoursePage(Model model) {
        model.addAttribute(new Course());
        return "courseAddForm";
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public String saveCourse(@Valid Course course, Errors errors) {
        if (errors.hasErrors()) {
            return "courseAddForm";
        }
        if (course != null) if (course.isValid()) {
            updateService.save(course);
            return "redirect:/courseList?page=1";
        }
        return "courseAddForm";
    }
}
