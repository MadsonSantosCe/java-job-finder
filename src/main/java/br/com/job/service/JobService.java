package br.com.job.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import br.com.job.Entity.Job;
import br.com.job.repository.JobRepository;

@Service
public class JobService {
    
    @Autowired
    private JobRepository jobRepository;

    public List<Job> findAll(){
        return jobRepository.findAll();
    }

    public Job findById(Integer id){
        return jobRepository.findById(id).get();
    }

    public Job save(Job post){
        return jobRepository.save(post);
    }

    public void delete(Integer id){
        jobRepository.deleteById(id);
    }
}