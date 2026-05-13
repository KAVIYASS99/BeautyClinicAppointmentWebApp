package com.beautyclinic.notification_service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class AppointmentEventConsumer {

    @KafkaListener(topics = "appointment-created", groupId = "notification-group")
    public void consume(String message) {
        System.out.println("Received appointment event: " + message);
        // Here, you can call a method to send an email
        sendEmailNotification(message);
    }

    private void sendEmailNotification(String message) {
        // Just a simple print for now
        System.out.println("Sending email for: " + message);
    }
}
