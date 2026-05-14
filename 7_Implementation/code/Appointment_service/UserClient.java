package com.beautyclinic.appointment_service.client;

import com.beautyclinic.appointment_service.dto.UserDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "user-service")
public interface UserClient {

    @GetMapping("/users/{id}")
    UserDTO getUserById(@PathVariable Long id);
}
