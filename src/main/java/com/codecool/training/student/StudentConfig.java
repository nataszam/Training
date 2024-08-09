package com.codecool.training.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {
@Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
                   Student ania =  new Student(
                            "Ania",
                            "ania@gmial.com",
                            LocalDate.of(2000, 5, 13)

                    );
            Student alex =  new Student(
                    "Alex",
                    "alex@gmial.com",
                    LocalDate.of(2004, 6, 17)

            );
            repository.saveAll(List.of(ania, alex));
        };
    }
}
