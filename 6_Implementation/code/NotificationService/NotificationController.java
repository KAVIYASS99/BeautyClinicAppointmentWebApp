package com.beautyclinic.notification_service;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/notifications")
public class NotificationController {

    @PostMapping
    public String sendNotification(@RequestBody String message) {
        System.out.println("Notification Received: " + message);
        return "Notification sent successfully!";
    }
}
