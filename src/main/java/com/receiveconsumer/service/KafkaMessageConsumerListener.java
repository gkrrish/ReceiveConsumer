package com.receiveconsumer.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
@Service
public class KafkaMessageConsumerListener {

	@KafkaListener(topics = "TEST-TOPIC", groupId = "test-group")
	public void receiveMessage(String message) {

		System.out.println("********************************* ");
		System.out.println("Received message: " + message);

	}

}
