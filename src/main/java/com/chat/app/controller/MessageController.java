package com.chat.app.controller;

import com.chat.app.model.Message;
import com.chat.app.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("messages")
public class MessageController {
    @Autowired
    private MessageService messageService;

    @GetMapping("/messages")
    public List<Message> getMessage() {
        return messageService.getMessages();
    }

    @PostMapping("/messages")
    public Message saveMessage(@RequestBody Message message) {
        return messageService.saveMessage(message);
    }

    @DeleteMapping("/messages/{id}")
    public String deleteMessage(@PathVariable(name = "id") long id) {
        return messageService.deleteMessage(id);
    }

    @GetMapping("/messages/{id}")
    public Message getMessageById(@PathVariable(name = "id") long id) {
        return messageService.getMessageById(id);
    }
}
