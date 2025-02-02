package com.kevortega.spring.springboot_test.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/arithmeticException")
public class ArithmeticExceptionController {

    @GetMapping("")
    public String arithmeticException() {
        int a = 1;
        int b = 0;
        return String.valueOf(a / b);
    }
}
