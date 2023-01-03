package com.example.jan2023.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

    @RestController
    @RequestMapping("/hello")
    public class HelloController {
        @GetMapping("/greet")
        public String sayHello() {

            return "WELCOME TO THE SPRINGBOOT FRAMEWORK";
        }

        @GetMapping("/greet/{name}")
        public String sayHello(@PathVariable("name") String inputName)
        {
            return "HELLO "+inputName+ ", WELCOME TO THE SPRINGBOOT FRAMEWORK";
        }
    }

