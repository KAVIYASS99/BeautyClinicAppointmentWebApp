package com.beautyclinic.appointment_service.service;

import com.beautyclinic.appointment_service.client.UserClient;
import com.beautyclinic.appointment_service.dto.UserDTO;
import org.springframework.stereotype.Service;
import com.beautyclinic.appointment_service.kafka.AppointmentEventProducer;

@Service
public class AppointmentService {

    private final UserClient userClient;
    private final AppointmentEventProducer producer;

    public AppointmentService(UserClient userClient, AppointmentEventProducer producer) {
        this.userClient = userClient;
        this.producer = producer;
    }

    public String createAppointment(Long userId) {

        UserDTO user = userClient.getUserById(userId);

        // send event to Kafka
        producer.sendAppointmentEvent("Appointment booked for user: " + user.getName());

        return "Appointment created for user: " + user.getName();
    }
}
