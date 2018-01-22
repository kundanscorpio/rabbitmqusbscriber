package com.britishgas.subscriber.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.britishgas.subscriber.model.Message;

/**
 * Created by Kundan Sharma
 */
@RestController
@RequestMapping("/")
public class SubscribeController {
	 private static final Logger log = LoggerFactory.getLogger(SubscribeController.class);

    @Autowired
    List<Message> receivedMessages;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<Message> publishMessage(@RequestParam(value = "message", required = false) String message) {
    	log.info("Received message: " + receivedMessages);
        return receivedMessages ;
    }
}