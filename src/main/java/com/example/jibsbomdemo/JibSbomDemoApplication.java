package com.example.jibsbomdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JibSbomDemoApplication {

    public static void main(String[] args) {
        System.out.println("SBOM DEMO");
        SpringApplication.run(JibSbomDemoApplication.class, args);
    }
}
