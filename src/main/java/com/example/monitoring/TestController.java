package com.example.monitoring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/testTraffic")
    public void testGet() {
        System.out.println("hi");
    }
}
