package net.proselyte.springmvc.controller;

import net.proselyte.springmvc.model.Developer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DeveloperController {

    @RequestMapping(value = "/", method = RequestMethod.GET)

    public String index() {
        return "/index";
    }

    @RequestMapping(value = "developer", method = RequestMethod.GET)

    public ModelAndView developer() {
        return new ModelAndView("developer", "command", new Developer());
    }

    @RequestMapping(value = "/addDeveloper", method = RequestMethod.POST)

    public String addStudent(@ModelAttribute("mvc-dispatcher") Developer developer,
                             ModelMap model) {
        model.addAttribute("num1", developer.getNum1());
        model.addAttribute("num2", developer.getNum2());
        //model.addAttribute("result", developer.getRe());


        return "result";
    }
}
