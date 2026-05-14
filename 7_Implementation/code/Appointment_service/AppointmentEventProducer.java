package com.beautyclinic.appointment_service.kafka;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class AppointmentEventProducer {

    private final KafkaTemplate<String, String> kafkaTemplate;

    public AppointmentEventProducer(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendAppointmentEvent(String message) {
        kafkaTemplate.send("appointment-created", message);
    }
}
