package com.chat.app.service;

import com.chat.app.model.Message;
import com.chat.app.repository.MessageRepository;
import org.hibernate.service.spi.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageService {
    @Autowired
    private MessageRepository messageRepository;

    public List<Message> getMessages() {
        return messageRepository.findAll();
    }

    public Message saveMessage(Message message) {
        if (message.getSender() == null)
            throw new ServiceException("Sender cannot be empty");

        if (message.getMessage() == null)
            throw new ServiceException("Message cannot be empty");

        return messageRepository.save(message);
    }

    public String deleteMessage(Long id) {
        if (id == null)
            throw new ServiceException("Id cannot be null");

        try {
            messageRepository.deleteById(id);
        } catch (EmptyResultDataAccessException e) {
            return "Record with id: " + id + " not found.";
        }
        return "Record with id: " + id + " delete successfully";
    }

    public Message getMessageById(long id) {
        if (messageRepository.findById(id).isPresent())
            return messageRepository.findById(id).get();
        return null;
    }
}
