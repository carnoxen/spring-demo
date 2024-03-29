package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.user.UserController;
import com.example.demo.user.UserRepository;
import com.example.demo.user.UserService;

import jakarta.transaction.Transactional;

@SpringBootTest
class DemoApplicationTests {
	@Autowired
	private UserController userController;
	@Autowired
	private UserService userService;
	@Autowired
	private UserRepository userRepository;

	@Test
	@Transactional
	void contextLoads() {
		assertNotNull(userController);
		assertNotNull(userService);
		assertNotNull(userRepository);
	}

}
