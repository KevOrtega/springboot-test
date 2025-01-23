package com.kevortega.spring.springboot_test.controllers;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ExampleRestController {

    
    @GetMapping("/info_details2")
    public Map<String, Object> info_details2(){
        Map<String, Object> map = new HashMap<>();
        map.put("title", "Spring Boot Page");
        map.put("subtitle", "This is a subtitle");
        map.put("ip", getIpAddress());
        return map;
    }

    private String getIpAddress() {
        String ipAddress = "";
        try {
            ipAddress = InetAddress.getLocalHost().getHostAddress();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        return ipAddress;
    }
}
