package br.com.job.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.job.Entity.Job;

@Repository
public interface JobRepository extends JpaRepository<Job, Integer> {
    
}