/*
 * MessageRepository.java
 */
package com.seihitsu.seihitsuback.message;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Class description goes here.
 *
 * @author Ameziel
 */
public interface MessageRepository extends JpaRepository<MessageClient, Long> {

}
