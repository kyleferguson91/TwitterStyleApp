package org.ac.cst8277.ferguson.kyle.usermanagement.usermanagementservice.controllers;

import org.ac.cst8277.ferguson.kyle.usermanagement.usermanagementservice.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password) {
        return userService.login(username, password);
    }

    @GetMapping("/validate")
    public boolean validateToken(@RequestParam String token) {
        return userService.validateToken(token);
    }
}