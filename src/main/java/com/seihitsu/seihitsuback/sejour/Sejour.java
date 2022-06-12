package com.seihitsu.seihitsuback.sejour;

import com.seihitsu.seihitsuback.client.Client;
import com.seihitsu.seihitsuback.employe.Employe;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

//@Entity
//@Table(name = "sejour")
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
//@Getter
//@Setter
//@ToString
public class Sejour {

    private Long idSejour;

    private Client refClient;

    private Employe refEmploye;

    private Date dateDebut;

    private Date dateFin;

            // sejourChambre
            // refsejour
            //refchembre
}
