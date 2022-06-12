package com.seihitsu.seihitsuback.employe;

import com.seihitsu.seihitsuback.client.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeRepository extends JpaRepository<Client, Long> {

}
