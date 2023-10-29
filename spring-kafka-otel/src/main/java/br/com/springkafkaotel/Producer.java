package br.com.springkafkaotel;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Producer {



    private KafkaTemplate<String, String> kafkaTemplate;

    public Producer(KafkaTemplate<String, String> KafkaTemplate){

        this.kafkaTemplate = KafkaTemplate;
    }

    public void sendMessage(String message){
        kafkaTemplate.send("topic-v1", message);
    }
}
