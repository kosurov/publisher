package com.github.kosurov.publisher.controllers;

import com.github.kosurov.publisher.models.Message;
import com.github.kosurov.publisher.services.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/publisher")
public class MessageController {

    private final MessageService messageService;

    @Autowired
    public MessageController(MessageService messageService) {
        this.messageService = messageService;
    }

    @GetMapping("/getMessage")
    public Message getMessage() {
        return messageService.generateRandomMessage();
    }
}
