package com.seihitsu.seihitsuback.client;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.seihitsu.seihitsuback.sejour.Sejour;
import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "client")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Client {

    @Id
    @SequenceGenerator(
            name = "client_sequence",
            sequenceName = "client_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "client_sequence"
    )
    private Long idClient;

    @Column(name ="nom")
    private String nom;
    @Column(name = "prenom")
    private String prenom;
    @Column(name = "email")
    private String email;

    @OneToMany(mappedBy = "refClient")
    @JsonIgnoreProperties(value = { "refClient" }, allowSetters = true)
    private Set<Sejour> sejours = new HashSet<>();


    /**
     * Client Constructeur
     * @param arg_nom
     * @param arg_prenom
     * @param arg_email
     */
    public Client(String arg_nom, String arg_prenom, String arg_email) {
        this.nom    = arg_nom;
        this.prenom = arg_prenom;
        this.email  = arg_email;
    }
}
