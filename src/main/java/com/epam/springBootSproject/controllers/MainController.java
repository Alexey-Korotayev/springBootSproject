package com.epam.springBootSproject.controllers;

import com.epam.springBootSproject.services.SuperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.Map;

@Controller
public class MainController {
//    @Value("${application.message:mmm.... You must be  Sprig }")
    @Value( "${application.message}")
    private String message = "Default message";

    @Value( "${application.hello.message}")
    private String message2 = "Default message";

    @Autowired
    private SuperService superService;

    @GetMapping("/")
    public String welcome(Map<String, Object> model){
        model.put("time", new Date());
        model.put("message", this.message);
        model.put("message2", this.message2);
        return "welcome";
    }

    @GetMapping(value = "/carList")
    public ModelAndView getCars() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("cars", superService.getCars());
        return modelAndView;
    }

}
