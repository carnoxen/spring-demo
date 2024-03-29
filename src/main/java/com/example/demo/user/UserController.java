package com.example.demo.user;

import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;





@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping
    public String sayHello() {
        return "Hello";
    }
    

    @PostMapping
    public User postMethodName(@RequestBody UserForm userForm) {
        return userService.createUser(userForm.toUser());
    }
    
    @GetMapping("/{id}")
    public Optional<User> getMethodName(@PathVariable int id) {
        return userService.findUser(id);
    }
    
    @PutMapping("/{id}")
    public User putMethodName(@PathVariable int id, @RequestBody UserForm userForm) {
        return userService.updateUser(id, userForm.toUser());
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable int id) {
        userService.deleteUser(id);
        return String.format("user id %d deleted", id);
    }
}
