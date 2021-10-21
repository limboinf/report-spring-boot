package com.limbo.report.spring.boot.autoconfig;

import java.util.ArrayList;
import java.util.List;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Data
@ConfigurationProperties(prefix = "report.greeting")
//@Component
public class GreetingProperties {

    /**
     * GreetingProperties 开关
     */
    boolean enable = false;

    /**
     * need members
     */
    List<String> members = new ArrayList<>();
}
