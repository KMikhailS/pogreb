package ru.kmikhails;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("ru.kmikhails.*")
@EntityScan("ru.kmikhails.*")
@ComponentScan("ru.kmikhails.*")
@SpringBootApplication
public class RestService {
    public static void main(String[] args) {
        SpringApplication.run(RestService.class);
    }
}
