package com.limbo.report.spring.boot.autoconfig;

import java.util.Arrays;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ConditionalOnProperty(value = "report.greeting.enable", havingValue = "true")
//@Import(GreetingProperties.class)
@EnableConfigurationProperties(GreetingProperties.class)
public class GreetingAutoConfiguration {

    @Bean
    public GreetingService greetingService(GreetingProperties greetingProperties){
        return new GreetingService(greetingProperties.getMembers());
    }

}
