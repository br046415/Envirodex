package com.envirodex.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class HelloWorldModel implements Serializable {
    private String id;
    private String message;
}
