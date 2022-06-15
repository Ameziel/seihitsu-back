package com.seihitsu.seihitsuback.sejour;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.seihitsu.seihitsuback.chambre.Chambre;
import com.seihitsu.seihitsuback.client.Client;
import com.seihitsu.seihitsuback.employe.Employe;
import lombok.*;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "sejour")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Sejour {

    @Id
    @SequenceGenerator(
            name = "sejour_sequence",
            sequenceName = "sejour_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "sejour_sequence"
    )
    private Long idSejour;

    @ManyToOne
    @JsonIgnoreProperties(value = {"sejours"}) //TODO CHECK
    private Client refClient;

    @ManyToOne
    @JsonIgnoreProperties(value = {"sejours"})
    private Employe refEmploye;

    @ManyToOne
    @JsonIgnoreProperties(value = {"sejours"})
    private Chambre chambre;

    private Instant dateDebut;

    private Instant dateFin;

    /**
     * Constructeur d'un Sejour
     * @param refClient  référence d'un objet client
     * @param refEmploye référence d'un objet employé
     * @param chambre    référence d'un objet chambre
     * @param dateDebut  date à laquelle la réservation commence
     * @param dateFin    date à laquelle la réservation termine
     */
    public Sejour(Client refClient, Employe refEmploye, Chambre chambre, Instant dateDebut, Instant dateFin) {
        this.refClient = refClient;
        this.refEmploye = refEmploye;
        this.chambre = chambre;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
    }
}
