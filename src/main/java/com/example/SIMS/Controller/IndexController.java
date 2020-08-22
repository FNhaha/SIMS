package com.example.SIMS.Controller;

import com.example.SIMS.domain.Student;
import com.example.SIMS.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexController {
    @Autowired
    private SearchService searchService;

    @RequestMapping("/")
    public String home() {
        return "home";
    }

    @RequestMapping(value = "/add/student", method = RequestMethod.GET)
    public String getAddStudentPage(Model model) {
        model.addAttribute(new Student());
        return "studentAddForm";
    }

    @RequestMapping(value = "/student/list", method = RequestMethod.GET)
    public String getStudentList(@RequestParam int page, Model model) {
        model.addAllAttributes(searchService.getStudentListByPage(page));
        return "studentList";
    }
}
