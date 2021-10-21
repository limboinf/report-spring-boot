package com.limbo.report.spring.boot.example;

import java.util.List;
import java.util.Map;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.annotation.Validated;

@Data
@Configuration
@ConfigurationProperties(
        prefix = "demo.bind",       // 前缀
        ignoreUnknownFields = true,  // 忽略未知字段（默认true)
        ignoreInvalidFields = true  // 允许失败，当配置的参数数据格式不对是容忍失败，以null等默认值替代
)
@Validated
public class BindConfig {

    /**
     * set your name
     */
    @NotEmpty
    private String name;

    // 结合默认值 + ignoreInvalidFields 方式来支持配置的最大可用性
    // 设置属性的默认值，表示当这个配置不存在或者设置非法时，使用默认的配置
    @Max(30)
    @Min(5)
    private Integer age = 18;

    private List<String> yourLanguage;

    private Map<String, String> yourLocation;

    private Jwt jwt;
}