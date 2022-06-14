package com.seihitsu.seihitsuback.employe;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.seihitsu.seihitsuback.sejour.Sejour;
import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "employe")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Employe {

    @Id
    @SequenceGenerator(
            name = "employe_sequence",
            sequenceName = "employe_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "employe_sequence"
    )
    private Long idEmploye;

    @Column(name = "nom")
    private String nom;
    @Column(name = "prenom")
    private String prenom;
    @Column(name = "libellePoste")
    private String libellePoste;

    @OneToMany(mappedBy = "refEmploye")
    @JsonIgnoreProperties(value = { "refEmploye" }, allowSetters = true)
    private Set<Sejour> sejours = new HashSet<>();

    /**
     * Employe Constructeur
     * @param arg_nom
     * @param arg_prenom
     * @param arg_libellePoste
     */
    public Employe(String arg_nom, String arg_prenom, String arg_libellePoste) {
        this.nom          = arg_nom;
        this.prenom       = arg_prenom;
        this.libellePoste = arg_libellePoste;
    }
}
