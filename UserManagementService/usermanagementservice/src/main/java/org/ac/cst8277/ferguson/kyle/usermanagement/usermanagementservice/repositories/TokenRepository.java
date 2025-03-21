package org.ac.cst8277.ferguson.kyle.usermanagement.usermanagementservice.repositories;

import org.ac.cst8277.ferguson.kyle.usermanagement.usermanagementservice.entities.Token;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TokenRepository extends JpaRepository<Token, String> {
    boolean existsByToken(String token);
}