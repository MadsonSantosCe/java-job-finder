package br.com.job.service;

import java.text.ParseException;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.job.Entity.Job;
import br.com.job.repository.JobRepository;

@Service
public class DBService {

    @Autowired
    JobRepository jobRepository;

    public void instantiateTestDatabase() throws ParseException {
        Job job1 = new Job(null, "Dev Java", "Auxiliar na programação", "IVIA", "4000", "fernanda@gmail.com");
        jobRepository.saveAll(Arrays.asList(job1));
    }
}