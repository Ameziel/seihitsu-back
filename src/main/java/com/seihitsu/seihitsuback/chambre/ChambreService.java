/*
 * ChambreService.java
 */
package com.seihitsu.seihitsuback.chambre;

import com.seihitsu.seihitsuback.client.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Class description goes here.
 *
 * @author Ameziel
 */
@Service
public class ChambreService {

    private final ChambreRepository chambreRepository;
    @Autowired
    public ChambreService(ChambreRepository chambreRepository) {
        this.chambreRepository = chambreRepository;
    }

    /**
     * Retourne une liste de toutes les chambres de l'application
     * @return une liste de chambre
     */
    public List<Chambre> getChambres() {
        return chambreRepository.findAll();
    }

//    /**
//     * Retourne une chambre par son identifiant. (ID)
//     * @return La chambre de l'application(ID)
//     */
//    public Optional<Chambre> getChambreById(Long chambreid) {
//        boolean exists = chambreRepository.existsById(chambreid);
//        if(!exists) {
//            throw new ChambreNotFoundException(chambreid);
//        }
//        return chambreRepository.getById(chambreid);
//    }

    /**
     * Ajoute une nouvelle chambre à l'application
     * @param chambre
     */
    public void addNewChambre(Chambre chambre) { chambreRepository.save(chambre);
    }

    /**
     * Supprime une chambre de l'application
     * TODO Si une chambre a déjà eu des réservation ne pas la supprimer.
     * @param chambreId
     */
    public void deleteChambre(Long chambreId) { chambreRepository.deleteById(chambreId);
    }
}
