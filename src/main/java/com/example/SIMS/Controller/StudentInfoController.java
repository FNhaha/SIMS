package com.example.SIMS.Controller;

import com.example.SIMS.domain.StudentInfoVo;
import com.example.SIMS.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value = "/studentInfo")
public class StudentInfoController {
    @Autowired
    private SearchService searchService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String getStudentInformation(@RequestParam long id, Model model) {
        StudentInfoVo vo = searchService.getStudentInformation(id);
        if (vo != null) {
            model.addAttribute(vo);
            return "studentInfo";
        }
        model.addAttribute(StudentInfoVo.buildFailed());
        return "studentInfo";
    }
}
