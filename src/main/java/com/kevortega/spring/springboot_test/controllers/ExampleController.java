package com.kevortega.spring.springboot_test.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.kevortega.spring.springboot_test.models.Employee;


@Controller
public class ExampleController {

    /*
    Using a map
    @GetMapping("/info_details")
    public String info(Map<String, Object> model){
        model.put("title", "Server Online");
        model.put("subtitle", "Demo");
        model.put("ip", "192.168.0.1");
        return "info_details";
    }
    */

    @GetMapping("/info_details")
    public String info(Model model){
        Employee employee = new Employee(1, 35, 123456789, "Kevin", "Ortega", null, "Developer");
        model.addAttribute("employee", employee);
        return "info_details";
    }


@ModelAttribute("Employees")
public List<Employee> employees(){
    return Arrays.asList(
        new Employee(1, 35, 123456789, "Kevin", "Ortega", null, "Developer"),
        new Employee(2, 30, 987654321, "Juan", "Perez", null, "QA"),
        new Employee(3, 25, 555555555, "Pedro", "Garcia", null, "DevOps")
    );
}

}
