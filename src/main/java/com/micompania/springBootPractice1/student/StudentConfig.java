package com.micompania.springBootPractice1.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.JANUARY;
import static java.time.Month.OCTOBER;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRespository studentRespository) {
        return args -> {
           Student mariam = new Student(1L, "Mariam",  LocalDate.of(2000, JANUARY, 5), "mariam.jamal@something.net");
           Student ivan = new Student("Ivan",  LocalDate.of(1999, OCTOBER, 26), "ivan@something.net");
           studentRespository.saveAll(List.of(mariam, ivan));
        };
    }
}
