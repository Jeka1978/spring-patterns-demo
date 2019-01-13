package com.naya.lazy_singleton;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Evgeny Borisov
 */
@SpringBootApplication
public class MainConf {
    public static void main(String[] args) {
        SpringApplication.run(MainConf.class);
    }
}
