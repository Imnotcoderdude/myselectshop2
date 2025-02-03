package com.sparta.myselectshop2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class Myselectshop2Application {

    public static void main(String[] args) {
        SpringApplication.run(Myselectshop2Application.class, args);
    }

}
