package com.limbo.report.spring.boot.autoconfig;

import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class GreetingService {

    private List<String> members = new ArrayList<>();

    public void sayHello(){
        members.forEach(s -> System.out.println("hello " + s));
    }
}

