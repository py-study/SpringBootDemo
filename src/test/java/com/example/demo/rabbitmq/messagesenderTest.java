package com.example.demo.rabbitmq;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class messagesenderTest {

    @Autowired
    private messagesender messagesender;

    @Test
    public void send() throws Exception {
        messagesender.send();
    }
}