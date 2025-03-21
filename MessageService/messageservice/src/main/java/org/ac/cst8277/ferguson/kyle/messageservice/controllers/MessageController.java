package org.ac.cst8277.ferguson.kyle.messageservice.controllers;

import org.ac.cst8277.ferguson.kyle.messageservice.entities.Message;
import org.ac.cst8277.ferguson.kyle.messageservice.services.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/messages")
public class MessageController {
    @Autowired
    private MessageService messageService;

    @GetMapping("/producer/{producerId}")
    public List<Message> getMessagesByProducer(@PathVariable UUID producerId) {
        return messageService.getMessagesByProducer(producerId);
    }

    @GetMapping("/search")
    public List<Message> searchMessages(@RequestParam String content) {
        return messageService.searchMessages(content);
    }
}