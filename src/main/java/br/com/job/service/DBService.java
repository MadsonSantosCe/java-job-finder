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
        Job job1 = new Job(null, "Dev Java", "Auxiliar na programação", "IVIA", "4000", "fernanda@gmail.com", false);
        Job job2 = new Job(null, "Programador Node JS", "Auxiliar na programação", "Instintuto Atlântico", "4000", "Luis@gmail.com", false);
        Job job3 = new Job(null, "Java Senior", "Auxiliar na programação", "Qintess", "4000", "maria@gmail.com", false);
        Job job4 = new Job(null, "Desenvolvedor React", "Auxiliar na programação", "Mobills", "4000", "Marcos@gmail.com", false);
        jobRepository.saveAll(Arrays.asList(job1, job2, job3, job4));
    }
}