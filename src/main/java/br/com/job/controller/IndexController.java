package br.com.job.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.beans.factory.annotation.Autowired;

import br.com.job.service.JobService;

@Controller
public class IndexController {

    @Autowired
    private JobService jobService;

    @RequestMapping("/")
    public ModelAndView index(){
        ModelAndView modelAndView = new ModelAndView("/index");
        modelAndView.addObject("jobs", jobService.findAll());
        return modelAndView;
    }
}