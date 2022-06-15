/*
 * MessageClient.java
 */
package com.seihitsu.seihitsuback.message;

import lombok.*;

import javax.persistence.*;

/**
 * Classe représentant un message envoyer par le formulaire de contact
 *
 * @author Ameziel
 */
@Entity
@Table(name = "messageclient")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class MessageClient {

    @Id
    @GeneratedValue
    private Long idMessage;
    @Column(name = "email")
    private String email;
    @Column(name = "contenu")
    private String contenu;
    @Column(name = "nouveau")
    private boolean nouveau;
}
