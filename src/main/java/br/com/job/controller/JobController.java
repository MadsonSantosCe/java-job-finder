package br.com.job.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.beans.factory.annotation.Autowired;

import br.com.job.service.JobService;

@Controller
public class JobController {
    
    @Autowired
    private JobService jobService;

    @RequestMapping(value = "/jobs", method = RequestMethod.GET)
    public ModelAndView findAll(){
        ModelAndView modelAndView = new ModelAndView("/jobs");
        return modelAndView;
    }
}