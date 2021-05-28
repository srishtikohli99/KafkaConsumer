package com.kafkaConsumer.demo.consumer;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import org.slf4j.Logger;

@Component
@Slf4j
public class LibraryEventsConsumer {

    Logger logger = LoggerFactory.getLogger(LibraryEventsConsumer.class);
    @KafkaListener(topics = {"library-events"})
    public void onMessage(ConsumerRecord<Integer, String> consumerRecord){
        logger.info("Consumer Record :{} ", consumerRecord);

    }
}
