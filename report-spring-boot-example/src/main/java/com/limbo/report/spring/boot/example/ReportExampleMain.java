package com.limbo.report.spring.boot.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// @SpringBootApplication
@SpringBootApplication(scanBasePackages = "com.limbo.report")
public class ReportExampleMain {

    public static void main(String[] args) {
        SpringApplication.run(ReportExampleMain.class, args);
    }
}
