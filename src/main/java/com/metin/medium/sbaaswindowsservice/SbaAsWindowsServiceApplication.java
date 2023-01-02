package com.metin.medium.sbaaswindowsservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SbaAsWindowsServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SbaAsWindowsServiceApplication.class, args);
    }

    @GetMapping("/")
    public String status() {
        return "Server is running";
    }
}
