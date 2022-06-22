package com.seihitsu.seihitsuback.chambre;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.seihitsu.seihitsuback.sejour.Sejour;
import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "chambre")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Chambre {

    @Id
    @GeneratedValue
    private Long idChambre;
    @Column(name = "prixNuitee")
    private int prixNuitee;
    @Column(name = "categorie")
    private String categorie;
    @Column(name = "description")
    private String description;

    @OneToMany(mappedBy = "chambre")
    @JsonIgnoreProperties(value = { "chambre" }, allowSetters = true)
    private Set<Sejour> sejours = new HashSet<>();

    //TODO v2 rendre la chambre indisponible à la réservation si travaux etc.

    /**
     * Constructeur chambre
     * @param prixNuitee
     * @param categorie
     * @param description
     */
    public Chambre(int prixNuitee, String categorie, String description) {
        this.prixNuitee = prixNuitee;
        this.categorie = categorie;
        this.description = description;
    }
}
