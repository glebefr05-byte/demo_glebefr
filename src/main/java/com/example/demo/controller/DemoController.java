package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api/say")
public class DemoController {

    @GetMapping
    public String hello() {
        return "Hello!";
    }

    @GetMapping(params = "name")
    public String sayHello(@RequestParam String name) {
        return "Hello " + name + "!";
    }
}
