package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController implements IDemoController {

    @Override
    @GetMapping(path = "/demo2")
    public String sayHello(@RequestParam("name") String name) {
        return "Hello, " + name;
    }
}
