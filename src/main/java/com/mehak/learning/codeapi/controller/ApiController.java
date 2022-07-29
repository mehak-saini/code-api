package com.mehak.learning.codeapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @GetMapping(path = "/hello")
    public String sayHello(){
        return "Hello";
    }
}
