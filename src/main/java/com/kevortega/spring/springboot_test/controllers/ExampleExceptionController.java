package com.kevortega.spring.springboot_test.controllers;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/exception")
public class ExampleExceptionController {

    @GetMapping("/arithmetic")
    public String arithmeticException() {
        int a = 1;
        int b = 0;
        return String.valueOf(a / b);
    }

    @GetMapping("/divide")
    public ResponseEntity<String> divide(
        @RequestParam int numerator, 
        @RequestParam int denominator
    ) {
        try {
            int result = numerator / denominator;
            return ResponseEntity.ok("Result: " + result);
        } catch (ArithmeticException e) {
            throw e;
        } catch (NumberFormatException e) {
            throw e;
        }
    }
}
