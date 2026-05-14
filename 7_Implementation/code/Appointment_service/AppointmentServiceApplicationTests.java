package com.beautyclinic.appointment_service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.beautyclinic.appointment_service.client.UserClient;

@Disabled
@SpringBootTest
class AppointmentServiceApplicationTests {

    @MockBean
    private UserClient userClient;

    @Test
    void contextLoads() {
    }
}