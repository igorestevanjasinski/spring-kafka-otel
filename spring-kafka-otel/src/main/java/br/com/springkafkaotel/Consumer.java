package br.com.springkafkaotel;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {
    @KafkaListener(topics = "topic-v1", groupId = "group-1")
    public void receiveMessage(String message){
        System.out.println("Consumer Message " + message);
    }
}
