package com.seihitsu.seihitsuback.client;

import lombok.*;

import javax.persistence.*;

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
    private Long idclient;

    @Column(name ="nom")
    private String nom;
    @Column(name = "prenom")
    private String prenom;
    @Column(name = "email")
    private String email;

    public Client(String arg_nom, String arg_prenom, String arg_email) {
        this.nom = arg_nom;
        this.prenom = arg_prenom;
        this.email = arg_email;
    }
}
