package com.kafkaproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class KafkapublisherApplication {
	
	
	@Autowired
	private KafkaTemplate<String,Object> templete;
	private String topic ="spring-kafka";
	
	
	public string  publishMessage() {
		User user = new User(123,"Chandu",new String[] {"Korba","Balco","4th street"});
		template.send(topic,user);
		return "JSONData has been published";
		
	}
	

	public static void main(String[] args) {
		SpringApplication.run(KafkapublisherApplication.class, args);
	}

}
