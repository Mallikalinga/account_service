package com.mallika.account.accountService.consumer;

import com.mallika.account.accountService.model.User;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    @KafkaListener(topics = "${spring.kafka.topic}", groupId = "${spring.kafka.consumer.group}", containerFactory = "kafkaListenerContainerFactory")
    public void consumer(User user, Acknowledgment ack){
        ack.acknowledge();
        System.out.println("User Consumed.." + user);
    }
}
