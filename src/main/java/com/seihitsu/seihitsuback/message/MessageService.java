/*
 * MessageService.java
 */
package com.seihitsu.seihitsuback.message;

import com.seihitsu.seihitsuback.client.Client;
import com.seihitsu.seihitsuback.client.ClientNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

/**
 * Class description goes here.
 *
 * @author Ameziel
 */
public class MessageService {

    private final MessageRepository messageRepository;
    @Autowired
    public MessageService(MessageRepository messageService) {
        this.messageRepository = messageService;
    }


    /**
     * Retourne une liste de tous les messages de l'application
     * @return une liste de clients
     */
    public List<MessageClient> getMessagesClient() {
        return messageRepository.findAll();
    }

    /**
     * Retourne un message par son identifiant. (ID)
     * @return Le message de l'application(ID)
     */
    public Optional<MessageClient> getMessageClientById(Long messageId) {
        boolean exists = messageRepository.existsById(messageId);
        if (!exists) {
            throw new MessageClientNotFoundException(messageId);
        }
        return messageRepository.findById(messageId);
    }

    /**
     * Ajoute un nouveau messageClient à l'application
     * @param messageClient
     */
    public void addNewMessageClient(MessageClient messageClient) {
        messageRepository.save(messageClient);
    }

    /**
     * Supprime un messageClient de l'application
     * @param messageClientId
     */
    public void deleteMessageClient(Long messageClientId) {
        boolean exists = messageRepository.existsById(messageClientId);
        if (!exists) {
            throw new MessageClientNotFoundException(messageClientId);
        }
        messageRepository.deleteById(messageClientId);
    }

}
