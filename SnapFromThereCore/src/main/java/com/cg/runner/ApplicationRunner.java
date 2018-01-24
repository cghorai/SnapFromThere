package com.cg.runner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApplicationRunner {
    private static final Logger LOGGER = LoggerFactory.getLogger(ApplicationRunner.class);

    public static void main(String[] args) {
        SpringApplication.run(ApplicationRunner.class);
    }

}
