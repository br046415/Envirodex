package com.envirodex.configuration;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "hello-world")
@Data
public class HelloWorldConfiguration {
    private String message;
}