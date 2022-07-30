package com.mehak.learning.codeapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ApiController {

    @GetMapping(path = "/hello")
    public String sayHello(){
        return "Hello";
    }

    @GetMapping(path = "/fib")
    public List<Integer> fibonacci(@RequestParam(name="num", defaultValue = "10") Integer num){
       int a = 0;
       int b = 1;
       List<Integer> fib = new ArrayList<>();
       fib.add(a);
       fib.add(b);
       for(int i = 2;i<num;i++ ) {
           int next = a + b;
           fib.add(next);
           a = b;
           b = next;
       }

       return fib;
    }
}
