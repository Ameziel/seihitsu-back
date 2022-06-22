/*
 * MessageClientNotFoundException.java
 */
package com.seihitsu.seihitsuback.message;

/**
 * Class description goes here.
 *
 * @author Ameziel
 */
public class MessageClientNotFoundException extends RuntimeException {

    public MessageClientNotFoundException(Long id) {
        super("Le message avec l'id : " + id + " n'existe pas.");
    }
}
