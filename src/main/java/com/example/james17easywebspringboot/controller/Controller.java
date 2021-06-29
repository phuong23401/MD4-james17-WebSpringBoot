package com.example.james17easywebspringboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@org.springframework.stereotype.Controller
public class Controller {
    @GetMapping("/greeting")
    public ModelAndView showGreeting(){
        return new ModelAndView("/greeting");
    }
}
