package com.kevortega.spring.springboot_test.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/variable")
public class PathVariableController {
    @GetMapping("/page1/{message}")
    public ParamsDTO pagina1(@PathVariable String message) {
        ParamsDTO paramsDTO = new ParamsDTO();
        paramsDTO.setInformation(message);
        return paramsDTO;
    }
}
