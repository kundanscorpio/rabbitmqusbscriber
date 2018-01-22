package com.britishgas.subscriber;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;

import com.britishgas.subscriber.model.Message;

/**
 * Created by Kundan Sharma.
 */
@RabbitListener(queues = "pubSubQ")
public class Receiver {

	private static final Logger log = LoggerFactory.getLogger(Receiver.class);
    @Autowired
    List<Message> receivedMessages;

    @RabbitHandler
    public void receive(String in) {
    	log.info(in);
        Message message = new Message();
        message.setMessage(in);
        receivedMessages.add(message);
    }


    //This handler is for handling messages from management console
    @RabbitHandler
    public void receive(byte[] in) {
        String converted = new String(in);
        log.info(converted);
        Message message = new Message();
        message.setMessage(converted);
        receivedMessages.add(message);
    }
}