package com.limbo.report.spring.boot.example;

import lombok.Data;

@Data
public class Jwt {
    private String token;

    private Long timestamp;
}
