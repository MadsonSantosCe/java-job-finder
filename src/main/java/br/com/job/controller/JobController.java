package br.com.job.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.beans.factory.annotation.Autowired;

import br.com.job.service.JobService;

@Controller
public class JobController {
    
    @Autowired
    private JobService jobService;

    @GetMapping("/")
    public ModelAndView findAll() {
        ModelAndView modelAndView = new ModelAndView("/index");
        modelAndView.addObject("jobs", jobService.findAll());
        return modelAndView;
    }
}