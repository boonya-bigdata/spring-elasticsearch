package com.boonya.lab.es;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@Configuration
@SpringBootApplication
public class EsApp {

    public static void main(String[] args) {
        SpringApplication.run(EsApp.class, args);
    }
}

