package com.artarkatesoft.springbootmaven.controllers;

import com.artarkatesoft.springbootmaven.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

@RestController
public class ExampleController {

    @GetMapping("/")
    public Map<String, Object> getIndex() {
        User user = new User();
        user.setEmail("my email");
        user.setFirstName("Art");
        user.setLastName("Shyshkin");

        return Collections.singletonMap("user", user);
    }
}
