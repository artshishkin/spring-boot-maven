package com.artarkatesoft.springbootmaven.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

@RestController
public class ExampleController {

    @GetMapping("/")
    public Map<String, Object> getIndex() {
        return Collections.singletonMap("hello", "world");
    }
}
