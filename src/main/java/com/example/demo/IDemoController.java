package com.example.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public interface IDemoController {

    @GetMapping(path = "/demo")
    String sayHello(@RequestParam("name2") String name);
}
