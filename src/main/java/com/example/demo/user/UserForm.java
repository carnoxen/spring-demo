package com.example.demo.user;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class UserForm {
    private final String username;
    private final String password;

    public User toUser() {
        return new User(username, password);
    }
}
