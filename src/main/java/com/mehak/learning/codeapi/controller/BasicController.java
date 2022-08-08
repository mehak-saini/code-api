package com.mehak.learning.codeapi.controller;

import com.mehak.learning.codeapi.service.BasicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "/basic")
public class BasicController {
    @Autowired
    private BasicService bs;


//    Autowired using Constructor
//    @Autowired
//    public BasicController(BasicService bs){
//        this.bs = bs;
//    }

//    Autowired using Setter
//    @Autowired
//    public void setBs(BasicService bs) {
//        this.bs = bs;
//    }

    @GetMapping(path = "hello")
    public String sayHello(){
        return "Hello";
    }

    @GetMapping(path = "fib")
    public List<Integer> fibonacci(@RequestParam(name="num", defaultValue = "10") Integer num){
       return bs.getFibonacciSeries(num);
    }

    @GetMapping(path = "armstrong/{num}")
    public String ArmStrong(@PathVariable(name ="num") Integer num) {
        if (bs.isArmstrongNumber(num)) {
            return "Armstrong Number "+ num;
        }
        else{
            return "Nope "+ num;
        }
    }
}
