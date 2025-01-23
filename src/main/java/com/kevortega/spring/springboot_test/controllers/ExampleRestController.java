package com.kevortega.spring.springboot_test.controllers;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/api")
public class ExampleRestController {

    /*
    Request Mapping
    @RequestMapping(path = "/info_details2", method = RequestMethod.GET)
    */
    @GetMapping("info_details2")
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

