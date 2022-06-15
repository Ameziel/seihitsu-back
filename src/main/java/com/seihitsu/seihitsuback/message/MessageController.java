/*
 * MessageController.java
 */
package com.seihitsu.seihitsuback.message;

import com.seihitsu.seihitsuback.client.Client;
import com.seihitsu.seihitsuback.client.ClientService;
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
public class MessageController {

    private final MessageService messageService;

    @Autowired
    public MessageController(MessageService messageService) {
        this.messageService = messageService;
    }

    @GetMapping("/all")
    public List<MessageClient> getClients() {
        return messageService.getMessagesClient();
    }

    @GetMapping(path = "/{messageid}")
    public Optional<MessageClient> getMessageById(@PathVariable("messageid") Long messageid){
        return messageService.getMessageClientById(messageid);
    }

    @PostMapping("/add")
    public void ajouterMessageClient(@RequestBody MessageClient messageClient) {
        messageService.addNewMessageClient(messageClient);
    }

    @DeleteMapping(path = "/{messageid}")
    public void deleteClient(@PathVariable("messageid") Long messageid) {
        messageService.deleteMessageClient(messageid);
    }
}
