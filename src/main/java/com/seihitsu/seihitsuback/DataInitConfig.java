package com.seihitsu.seihitsuback;

import com.seihitsu.seihitsuback.client.Client;
import com.seihitsu.seihitsuback.client.ClientRepository;
import com.seihitsu.seihitsuback.employe.Employe;
import com.seihitsu.seihitsuback.employe.EmployeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;
/**
 * Valeur de départ pour l'application
 * @author Ameziel
 */
@Configuration
public class DataInitConfig {

    @Bean
    CommandLineRunner commandLineRunner(ClientRepository clientRepository, EmployeRepository employeRepository) {
        return args -> {
            Client a = new Client(
                    "sam",
                    "sic",
                    "email@gmail.com"
            );
            Client b = new Client(
                    "sam",
                    "sic",
                    "email@gmail.com"
            );
            clientRepository.saveAll
                    (List.of(a,b)
                    );
            Employe employe1 = new Employe(
                    "sam",
                    "sic",
                    "Maitre d'hotel"
            );
            Employe employe2 = new Employe(
                    "Samantha",
                    "sic",
                    "Hote de caisse"
            );
            employeRepository.saveAll
                    (List.of(employe1,employe2)
                    );
        };
    }
}
