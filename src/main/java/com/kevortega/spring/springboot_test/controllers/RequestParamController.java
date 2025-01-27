package com.kevortega.spring.springboot_test.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/params")
public class RequestParamController {

    @GetMapping("/details")
    public ParamsDTO getDetails(@RequestParam(required = false, defaultValue = "Information") String information) {
        ParamsDTO paramsDTO = new ParamsDTO();
        paramsDTO.setInformation(information);
        return paramsDTO;
    }

}
