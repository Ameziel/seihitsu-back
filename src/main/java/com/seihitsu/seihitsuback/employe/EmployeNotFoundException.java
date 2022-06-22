/*
 * EmployeNotFoundException.java
 */
package com.seihitsu.seihitsuback.employe;

/**
 * Class description goes here.
 *
 * @author Ameziel
 */
public class EmployeNotFoundException extends RuntimeException {

    public EmployeNotFoundException(Long id) {
        super("Le client avec l'id : " + id + " n'existe pas.");
    }
}
