package com.example.demo.user;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.NonNull;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User createUser(@NonNull User user) {
        return userRepository.save(user);
    }

    public Optional<User> findUser(int id) {
        return userRepository.findById(id);
    }

    public User updateUser(int id, @NonNull User user) {
        user.setId(id);
        return userRepository.save(user);
    }

    public int deleteUser(int id) {
        userRepository.deleteById(id);
        return id;
    }
}
