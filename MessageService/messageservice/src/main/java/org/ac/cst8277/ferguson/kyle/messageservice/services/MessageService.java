package org.ac.cst8277.ferguson.kyle.messageservice.services;

import java.util.List;
import java.util.UUID;

import org.ac.cst8277.ferguson.kyle.messageservice.entities.Message;
import org.ac.cst8277.ferguson.kyle.messageservice.repositories.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageService {
    @Autowired
    private MessageRepository messageRepository;

    public List<Message> getMessagesByProducer(UUID producerId) {
        return messageRepository.findByProducerId(producerId);
    }

    public List<Message> searchMessages(String content) {
        return messageRepository.findByContentContaining(content);
    }
}