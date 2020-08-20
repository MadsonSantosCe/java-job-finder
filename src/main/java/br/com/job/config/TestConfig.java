package br.com.job.config;

import br.com.job.service.DBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.text.ParseException;

@Configuration
@Profile("test")
public class TestConfig {
    
    @Autowired
    DBService dbservice;

    @Bean
    public boolean instantiateDatabase() throws ParseException {
        dbservice.instantiateTestDatabase();
        return true;
    }

}