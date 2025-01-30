package com.kevortega.spring.springboot_test.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kevortega.spring.springboot_test.models.Employee;

@RestController
@RequestMapping("api/variable")
public class PathVariableController {

    @Value("${config.user}")
    private String user;

    @Value("${config.code}")
    private int code;

    @Value("${config.message}")
    private String message;

    @Value("${config.values}")
    private String[] values;

    @GetMapping("/page1/{message}")
    public ParamsDTO pagina1(@PathVariable String message) {
        ParamsDTO paramsDTO = new ParamsDTO();
        paramsDTO.setInformation(message);
        return paramsDTO;
    }

    @PostMapping("/createEmployee")
    public Employee createEmployee(@RequestBody Employee employee) {
        return employee;
    }

    
    @GetMapping("/values")
    public Map<String, Object> getValues() {
        Map<String, Object> map = new HashMap<>();
        map.put("user", user);
        map.put("code", code);
        map.put("message", message);
        map.put("values", values);
        return map;
    }

}
