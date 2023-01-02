package com.metin.medium.sbaaswindowsservice.rest;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@RestController
@EnableScheduling
public class DBBackupController {

    String timeAndStatus = "";

    @Scheduled(fixedDelay = 10000)
    public void backup() {
        LocalDateTime now = LocalDateTime.now();
        String pattern = "dd-MM-yyyy HH:mm:ss";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        timeAndStatus = "Son yedekleme zamanı: " +
                now.format(formatter) + "<br/>" + "Başarı durumu: BAŞARILI";
    }

    @GetMapping("/info")
    public String showInfo() {
        return timeAndStatus;
    }
}