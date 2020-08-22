package br.com.job.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.job.Entity.Job;

@Repository
public interface JobRepository extends JpaRepository<Job, Integer> {
    
    @Query("SELECT obj FROM Job obj WHERE obj.title LIKE %:title%")
    List<Job> findByTitleLike(@Param("title") String title);
}