package com.sdf.jewelry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class JewelryApplication {

    public static void main(String[] args) {
        SpringApplication.run(JewelryApplication.class, args);
    }
}
