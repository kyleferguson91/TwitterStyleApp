package org.ac.cst8277.ferguson.kyle.usermanagement.usermanagementservice.repositories;

import java.util.UUID;

import org.ac.cst8277.ferguson.kyle.usermanagement.usermanagementservice.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, UUID> {
    User findByUsername(String username);
}