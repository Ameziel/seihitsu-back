package com.seihitsu.seihitsuback.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/client")
public class ClientController {

    private final ClientService clientService;

    @Autowired
    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping("/all")
    public List<Client> getClients() {
        return clientService.getClients();
    }

    @GetMapping(path = "/{clientid}")
    public void getClientById(@PathVariable("clientid") Long id){
//        return clientService.getClientById(id);
    }

    @PostMapping("/add")
    public void ajoutClient(@RequestBody Client client) {
        clientService.addNewClient(client);
    }

    @DeleteMapping(path = "/{clientid}")
    public void deleteClient(@PathVariable("clientid") Long id) {
        clientService.deleteClient(id);
    }

}
