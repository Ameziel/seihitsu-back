package com.seihitsu.seihitsuback.client;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {

    private final ClientRepository clientRepository;
    @Autowired
    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    /**
     * Consulte tous les clients de l'application
     * @return une liste de clients
     */
    public List<Client> getClients() {
        return clientRepository.findAll();
    }

    /**
     * Consulte un client par son identifiant. (ID)
     * @return Le client de l'application(ID)
     */
    public Optional<Client> getClientById(Long clientId) {
        boolean exists = clientRepository.existsById(clientId);
        if (!exists) {
            throw new ClientNotFoundException(clientId);
        }
        return clientRepository.findById(clientId);
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
        boolean exists = clientRepository.existsById(clientId);
        if (!exists) {
            throw new ClientNotFoundException(clientId);
        }
        clientRepository.deleteById(clientId);

    }
}
