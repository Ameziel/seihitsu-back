package com.seihitsu.seihitsuback.client;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;
@Configuration
public class ClientConfig {

    @Bean
    CommandLineRunner commandLineRunner(ClientRepository clientRepository) {
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
        };

    }
}
