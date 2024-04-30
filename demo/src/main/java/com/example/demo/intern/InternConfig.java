package com.example.demo.intern;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class InternConfig {

    @Bean
    CommandLineRunner commandLineRunner(InternRepository internRepository) {
        return args -> {
            Intern gleezell = new Intern(
                    "Gleezell",
                    "glarclone@gmail.com",
                    LocalDate.of(2024, Month.APRIL, 22)
            );

            internRepository.saveAll(
                    List.of(gleezell)
            );
        };
    }
}
