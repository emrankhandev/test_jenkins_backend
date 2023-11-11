package com.example.demo;

import org.springframework.format.datetime.standard.DateTimeContext;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
@RequestMapping
public class TestController {

    @GetMapping("/")
    ResponseEntity<String> age() {

        return new ResponseEntity<>(


                "Your age is " + new Date(),HttpStatus.OK);
    }

}
