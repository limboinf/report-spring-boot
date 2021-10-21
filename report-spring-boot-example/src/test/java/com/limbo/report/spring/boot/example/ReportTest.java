package com.limbo.report.spring.boot.example;

//import com.limbo.report.spring.boot.autoconfig.GreetingService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ReportTest {

//    @Autowired(required = false)
//    private GreetingService greetingService;
//
    @Autowired
    private BindConfig bindConfig;

//    @Test
//    public void reportTest() {
//        greetingService.sayHello();
//    }

    @Test
    public void bindTest() {
        System.out.println(bindConfig.toString());
    }
}
