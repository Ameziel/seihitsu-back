package com.seihitsu.seihitsuback.employe;

import com.seihitsu.seihitsuback.client.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/employe")
public class EmployeController {

    private final EmployeService employeService;

    @Autowired
    public EmployeController(EmployeService employeService) {
        this.employeService = employeService;
    }

    @GetMapping("/all")
    public List<Employe> getEmployes() {
        return employeService.getEmployes();
    }

    @PostMapping("/add")
    public void ajoutClient(@RequestBody Employe employe) {
        employeService.addNewEmploye(employe);
    }

    @DeleteMapping(path = "/{employeid}")
    public void deleteClient(@PathVariable("employeid") Long id) {
        employeService.deleteEMploye(id);
    }
}
