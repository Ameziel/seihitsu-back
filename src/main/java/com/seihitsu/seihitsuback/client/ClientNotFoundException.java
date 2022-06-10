package com.seihitsu.seihitsuback.client;

public class ClientNotFoundException extends  RuntimeException {

    ClientNotFoundException(Long id) {
        super("Le client avec l'id : " + id + " n'existe pas.");
    }
}
