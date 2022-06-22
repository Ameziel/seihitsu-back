/*
 * ChambreController.java
 */
package com.seihitsu.seihitsuback.chambre;

import com.seihitsu.seihitsuback.client.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * Class description goes here.
 *
 * @author Ameziel
 */
@RestController
@RequestMapping(path = "api/chambre")
public class ChambreController {

    private final ChambreService chambreService;
    @Autowired
    public ChambreController(ChambreService chambreService) {
        this.chambreService = chambreService;
    }
    @GetMapping("/all")
    public List<Chambre> getChambres() {
        return chambreService.getChambres();
    }

//    @GetMapping(path = "/{chambreid}")
//    public Optional<Chambre> getChambreById(@PathVariable("chambreid") Long chambreid){
//        return chambreService.getChambreById(chambreid);
//    }


    @PostMapping("/add")
    public void addChambre(@RequestBody Chambre chambre) {
        chambreService.addNewChambre(chambre);
    }

    @DeleteMapping(path = "/{chambreid}")
    public void deleteClient(@PathVariable("chambreid") Long id) {
        chambreService.deleteChambre(id);
    }

}
