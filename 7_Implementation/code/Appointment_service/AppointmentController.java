package com.beautyclinic.appointment_service.controller;

import com.beautyclinic.appointment_service.service.AppointmentService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/appointments")
public class AppointmentController {

    private final AppointmentService appointmentService;

    public AppointmentController(AppointmentService appointmentService) {
        this.appointmentService = appointmentService;
    }

    @PostMapping("/{userId}")
    public String create(@PathVariable Long userId) {
        return appointmentService.createAppointment(userId);
    }
}