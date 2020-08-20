package br.com.job.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class JobController {
    
    @GetMapping("/")
    public ModelAndView findAll() {
        ModelAndView modelAndView = new ModelAndView("/index");
        return modelAndView;
    }
}