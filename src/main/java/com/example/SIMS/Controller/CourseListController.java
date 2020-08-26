package com.example.SIMS.Controller;

import com.example.SIMS.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value = "/courseList")
public class CourseListController {
    @Autowired
    private SearchService searchService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String getCourseList(@RequestParam int page, Model model) {
        model.addAttribute(searchService.getCourseListByPage(page));
        return "courseList";
    }
}