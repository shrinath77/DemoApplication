package com.DemoApplication.DemoApplication.controller;

import com.DemoApplication.DemoApplication.model.User;
import com.DemoApplication.DemoApplication.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private static final Logger logger = (Logger) LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserRepository userRepository;

    @PostMapping
    public User createUser(@RequestBody User user) {

        logger.info("Creating new user:{}", user.getName());

        return userRepository.save(user);
    }

    @GetMapping
    public List<User> getAllUsers() {

        return userRepository.findAll();
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable String id) {

        logger.info("Getting all users");

        return userRepository.findById(id).orElse(null);
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable String id) {

        logger.warn(" Deleting  user", id);

        userRepository.deleteById(id);

        return "User deleted";

    }

}