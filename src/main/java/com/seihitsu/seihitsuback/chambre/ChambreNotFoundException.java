/*
 * ChambreNotFoundException.java
 */
package com.seihitsu.seihitsuback.chambre;

/**
 * Class description goes here.
 *
 * @author Ameziel
 */
public class ChambreNotFoundException extends RuntimeException{

    public ChambreNotFoundException(Long id) {
        super("La chambre avec l'id : " + id + " n'existe pas.");
    }
}
