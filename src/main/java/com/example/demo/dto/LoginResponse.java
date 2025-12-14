package com.example.demo.dto;

public class LoginResponse {

    private String status;
    private String role;
    private String message;

    public LoginResponse() {
    }

    public LoginResponse(String status, String role, String message) {
        this.status = status;
        this.role = role;
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public String getRole() {
        return role;
    }

    public String getMessage() {
        return message;
    }
}
