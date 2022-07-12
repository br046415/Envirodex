package com.envirodex.service;

import com.envirodex.configuration.HelloWorldConfiguration;
import com.envirodex.model.HelloWorldModel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class HelloWorldService {

    private final HelloWorldConfiguration helloWorldConfiguration;

    public HelloWorldModel getHelloWorldModel() {
        String id = UUID.randomUUID().toString();
        String message = helloWorldConfiguration.getMessage();
        return new HelloWorldModel(id, message);
    }
}
