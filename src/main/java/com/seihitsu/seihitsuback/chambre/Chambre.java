package com.seihitsu.seihitsuback.chambre;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;


public class Chambre {

    private Long idChambre;

    private int prixNuitee;

    private String categorie;

    private String description;
}
