package com.kevortega.spring.springboot_test.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


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
        model.addAttribute("title", "Server Online");
        model.addAttribute("subtitle", "Demo");
        model.addAttribute("ip", "192.168.0.1");
        return "info_details";
    }

}
