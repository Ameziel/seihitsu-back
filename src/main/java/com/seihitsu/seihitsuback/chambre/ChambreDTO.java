/*
 * ChambreDTO.java
 */
package com.seihitsu.seihitsuback.chambre;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Class description goes here.
 *
 * @author Ameziel
 */
public class ChambreDTO {


    private Long idChambre;

    private int prixNuitee;

    private String categorie;

    private String description;

    public ChambreDTO(Long idChambre, int prixNuitee, String categorie, String description) {
        this.idChambre = idChambre;
        this.prixNuitee = prixNuitee;
        this.categorie = categorie;
        this.description = description;
    }
}
