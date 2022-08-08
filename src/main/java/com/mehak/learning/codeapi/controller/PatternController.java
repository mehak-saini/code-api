package com.mehak.learning.codeapi.controller;

import com.mehak.learning.codeapi.service.PatternService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path ="/pattern")
public class PatternController {

    @Autowired
    PatternService ps;

    @GetMapping(path = "RightAngleTriangle")
    public StringBuilder RightAngleTriangle(@RequestParam(name = "num", defaultValue = "5") Integer num) {
       return ps.printPattern(num);
    }
}