/*
 * MessageClientController.java
 */
package com.seihitsu.seihitsuback.message;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * Class description goes here.
 *
 * @author Ameziel
 */
@RestController
@RequestMapping(path = "api/message")
public class MessageClientController {

    private final MessageClientService messageClientService;

    @Autowired
    public MessageClientController(MessageClientService messageClientService) {
        this.messageClientService = messageClientService;
    }

    @GetMapping("/all")
    public List<MessageClient> getClients() {
        return messageClientService.getMessagesClient();
    }

    @GetMapping(path = "/{messageid}")
    public Optional<MessageClient> getMessageById(@PathVariable("messageid") Long messageid){
        return messageClientService.getMessageClientById(messageid);
    }

    @PostMapping("/add")
    public void ajouterMessageClient(@RequestBody MessageClient messageClient) {
        messageClientService.addNewMessageClient(messageClient);
    }

    @DeleteMapping(path = "/{messageid}")
    public void deleteClient(@PathVariable("messageid") Long messageid) {
        messageClientService.deleteMessageClient(messageid);
    }
}
