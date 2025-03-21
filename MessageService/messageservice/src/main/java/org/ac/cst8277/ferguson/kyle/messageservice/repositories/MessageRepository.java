package org.ac.cst8277.ferguson.kyle.messageservice.repositories;

import java.util.List;
import java.util.UUID;

import org.ac.cst8277.ferguson.kyle.messageservice.entities.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message, UUID> {
    List<Message> findByProducerId(UUID producerId);
    List<Message> findByContentContaining(String content);
}