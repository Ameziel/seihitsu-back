/*
 * EmployeConfig.java
 */
package com.seihitsu.seihitsuback.employe;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

/**
 * Valeur de départ pour l'application
 * @author Ameziel
 */
@Configuration
public class EmployeConfig {

//
    CommandLineRunner commandLineRunner(EmployeRepository employeRepository) {
        return args -> {
            Employe a = new Employe(
                    "sam",
                    "sic",
                    "Maitre d'hotel"
            );
            Employe b = new Employe(
                    "Samantha",
                    "sic",
                    "Hote de caisse"
            );
            employeRepository.saveAll
                    (List.of(a,b)
                    );
        };
    }
}
