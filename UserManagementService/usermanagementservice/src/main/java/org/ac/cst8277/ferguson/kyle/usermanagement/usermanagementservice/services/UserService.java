package org.ac.cst8277.ferguson.kyle.usermanagement.usermanagementservice.services;

import java.util.UUID;

import org.ac.cst8277.ferguson.kyle.usermanagement.usermanagementservice.entities.Token;
import org.ac.cst8277.ferguson.kyle.usermanagement.usermanagementservice.entities.User;
import org.ac.cst8277.ferguson.kyle.usermanagement.usermanagementservice.repositories.TokenRepository;
import org.ac.cst8277.ferguson.kyle.usermanagement.usermanagementservice.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private TokenRepository tokenRepository;

    public String login(String username, String password) {
        User user = userRepository.findByUsername(username);
        if (user != null && user.getPassword().equals(password)) {
            UUID token = UUID.randomUUID();
            tokenRepository.save(new Token(token.toString(), user));
            return token.toString();
        }
        return null; // bad credentials
    }

    public boolean validateToken(String token) {
        return tokenRepository.existsByToken(token);
    }
}