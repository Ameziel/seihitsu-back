/*
 * MessageService.java
 */
package com.seihitsu.seihitsuback.message;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Class description goes here.
 *
 * @author Ameziel
 */
@Service
public class MessageClientService {

    private final MessageClientRepository messageClientRepository;
    @Autowired
    public MessageClientService(MessageClientRepository messageClientService) {
        this.messageClientRepository = messageClientService;
    }


    /**
     * Retourne une liste de tous les messages de l'application
     * @return une liste de clients
     */
    public List<MessageClient> getMessagesClient() {
        return messageClientRepository.findAll();
    }

    /**
     * Retourne un message par son identifiant. (ID)
     * @return Le message de l'application(ID)
     */
    public Optional<MessageClient> getMessageClientById(Long messageId) {
        boolean exists = messageClientRepository.existsById(messageId);
        if (!exists) {
            throw new MessageClientNotFoundException(messageId);
        }
        return messageClientRepository.findById(messageId);
    }

    /**
     * Ajoute un nouveau messageClient à l'application
     * @param messageClient
     */
    public void addNewMessageClient(MessageClient messageClient) {
        messageClientRepository.save(messageClient);
    }

    /**
     * Supprime un messageClient de l'application
     * @param messageClientId
     */
    public void deleteMessageClient(Long messageClientId) {
        boolean exists = messageClientRepository.existsById(messageClientId);
        if (!exists) {
            throw new MessageClientNotFoundException(messageClientId);
        }
        messageClientRepository.deleteById(messageClientId);
    }

}
