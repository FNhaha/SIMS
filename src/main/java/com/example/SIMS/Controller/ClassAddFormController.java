package com.example.SIMS.Controller;

import com.example.SIMS.domain.Class;
import com.example.SIMS.service.UpdateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
@RequestMapping("/add/class")
public class ClassAddFormController {
    @Autowired
    private UpdateService updateService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String getAddClassPage(Model model) {
        model.addAttribute(new Class());
        return "classAddForm";
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public String saveClass(@Valid Class _class, Errors errors) {
        if (errors.hasErrors()) {
            return "classAddForm";
        }
        if (_class != null) if (_class.isValid()) {
            updateService.save(_class);
            return "redirect:/classList?page=1";
        }
        return "classAddForm";
    }
}
