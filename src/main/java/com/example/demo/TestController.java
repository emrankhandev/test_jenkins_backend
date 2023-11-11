package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
@RequestMapping
public class TestController {

    @GetMapping(value = "/sir-r")
    public String getHello(){
        return  "Hello Mejan Vai - after build";
    }
}
