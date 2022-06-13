package com.seihitsu.seihitsuback.employe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeService {

    private final EmployeRepository employeRepository;
    @Autowired
    public EmployeService(EmployeRepository employeRepository) {
        this.employeRepository = employeRepository;
    }

    /**
     * Retourne une liste de tous les employes de l'application
     * @return une liste de tous les employes
     */
    public List<Employe> getEmployes() {
        return employeRepository.findAll();
    }

    /**
     * Retourne un employe par son identifiant. (ID)
     * @return L'employe de l'application(ID)
     */
    public Optional<Employe> getClientById(Long employeId) {
        boolean exists = employeRepository.existsById(employeId);
        if (!exists) {
            throw new EmployeNotFoundException(employeId);
        }
        return employeRepository.findById(employeId);
    }

    /**
     * Ajoute un nouvel employe à l'application
     * @param employe
     */
    public void addNewEmploye(Employe employe) {
        employeRepository.save(employe);
    }

    /**
     * Supprime un employe de l'application
     * TODO Si un employe est déjà concerné par une réservation l'en empecher.
     * @param employeId
     */
    public void deleteEMploye(Long employeId) {
        if (!employeRepository.existsById(employeId)) {
            throw new EmployeNotFoundException(employeId);
        }
        employeRepository.deleteById(employeId);
    }
}
