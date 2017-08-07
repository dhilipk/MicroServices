package com.mytrip.customer.notification.consumer;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.TopicPartition;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class KafkaMessageConsumer {

    @KafkaListener(topicPartitions = @TopicPartition(topic = "myTopic", partitions = {"0"}))
    public void listenToPart0(ConsumerRecord cr) throws Exception {
        log.info(cr.toString());
    }

    @KafkaListener(topicPartitions = @TopicPartition(topic = "myTopic", partitions = {"1"}))
    public void listenToPart1(ConsumerRecord cr) throws Exception {
        log.info(cr.toString());
    }

}
