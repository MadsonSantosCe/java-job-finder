package br.com.job.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.Collections;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.job.Entity.Job;
import br.com.job.service.JobService;

@Controller
public class JobController {
    
    @Autowired
    private JobService jobService;

    @RequestMapping("/")
    public ModelAndView index(){
        ModelAndView modelAndView = new ModelAndView("/index");
        List<Job> jobs = jobService.findAll();
        Collections.sort(jobs, Collections.reverseOrder());
        modelAndView.addObject("jobs", jobs);
        return modelAndView;
    }

    @RequestMapping(value = "/jobs", method = RequestMethod.GET)
    public ModelAndView pathAdd(Job job){
        ModelAndView modelAndView = new ModelAndView("/jobs");        
        modelAndView.addObject("job", job);
        return modelAndView;
    }

    @PostMapping("/save")
    public String save(@Valid Job job, BindingResult result) {

        if(result.hasErrors()) {
            return "redirect:/jobs";
        }

        jobService.save(job);
        return "redirect:/";
    }

}