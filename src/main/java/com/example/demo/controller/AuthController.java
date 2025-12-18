package com.example.demo.controller;

import com.example.demo.dto.LoginRequest;
import com.example.demo.dto.LoginResponse;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class AuthController {

    @PostMapping("/login")
    public LoginResponse login(@RequestBody LoginRequest request) {

        String username = request.getUsername();
        String password = request.getPassword();

        if ("doctor".equals(username) && "doc123".equals(password)) {
            return new LoginResponse(
                    "success",
                    "DOCTOR",
                    "Doctor login successful"
            );
        }

        if ("reception".equals(username) && "rec123".equals(password)) {
            return new LoginResponse(
                    "success",
                    "RECEPTION",
                    "Reception login successful"
            );
        }

        if ("admin".equals(username) && "admin123".equals(password)) {
            return new LoginResponse(
                    "success",
                    "ADMIN",
                    "Admin login successful"
            );
        }

        return new LoginResponse(
                "error",
                null,
                "Invalid username or password!"
        );
    }
}
