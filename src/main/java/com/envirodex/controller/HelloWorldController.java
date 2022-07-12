package com.envirodex.controller;

import com.envirodex.model.HelloWorldModel;
import com.envirodex.service.HelloWorldService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class HelloWorldController {

    private final HelloWorldService helloWorldService;

    @GetMapping("/getHelloWorld")
    public HelloWorldModel getHelloWorld() {
        return helloWorldService.getHelloWorldModel();
    }

}
