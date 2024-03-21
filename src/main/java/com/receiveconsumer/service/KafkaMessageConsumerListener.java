package com.receiveconsumer.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.receiveconsumer.util.ConsumerKafkaUTIL;
@Service
public class KafkaMessageConsumerListener {

	@KafkaListener(topics = ConsumerKafkaUTIL.TOPIC, groupId = "test-group")
	public void receiveMessage(String message) {

		System.out.println("********************************* ");
		System.out.println("Received message: " + message);

	}

}
