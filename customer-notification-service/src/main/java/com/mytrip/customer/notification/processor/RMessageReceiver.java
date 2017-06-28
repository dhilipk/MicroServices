package com.mytrip.customer.notification.processor;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class RMessageReceiver {

    @Bean
    public Queue queue() {
        return new Queue("CustomerQ", false);
    }

//    @RabbitListener(queues = "CustomerQ")
    public void processRegistration(String email) {
       System.out.println(email);
    }
}
