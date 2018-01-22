package com.britishgas.subscriber.configuration;

import com.britishgas.subscriber.Receiver;
import com.britishgas.subscriber.model.Message;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kundan Sharma
 */
@Configuration
public class SubscriberConfiguration {
    @Bean
    public Queue pubSubQ() {
        return new Queue("pubSubQ");
    }

    @Bean
    public Receiver receiver() {
        return new Receiver();
    }

    @Bean
    public List<Message> receivedMessages (){
        return new ArrayList<>();
    }
}
