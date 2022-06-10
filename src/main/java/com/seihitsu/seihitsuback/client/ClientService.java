package com.seihitsu.seihitsuback.client;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    private final ClientRepository clientRepository;
    @Autowired
    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public List<Client> getClients() {
        return clientRepository.findAll();
    }

    /**
     * Ajoute un nouveau client à l'application
     * @param client
     */
    public void addNewClient(Client client) {
        clientRepository.save(client);
    }

    /**
     * Supprime un client de l'application
     * TODO Si un client a déjà une réservation l'empecher d'être supprimé
     * @param clientId
     */
    public void deleteClient(Long clientId) {
        boolean exists = clientRepository.existsById(String.valueOf(clientId));
        if (!exists) {
            throw new ClientNotFoundException(clientId);
        }
        clientRepository.deleteById(String.valueOf(clientId));

    }
}
