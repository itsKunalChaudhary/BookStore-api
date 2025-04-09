package com.bookstore.bookstoreapi.dto;

import lombok.Data;

@Data
public class SignupRequest {
    private String email;
    private String password;
}
