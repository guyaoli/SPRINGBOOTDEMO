package com.gu.springdemo1.jms;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Service;

@Service("consumer1")
public class Consumer1 {
    @JmsListener(destination = "queueTest")
    @SendTo("returnQueueTest")
    public String reviewMessage(String message){
        System.out.println("consumer1接收到的消息是:"+message);
        return "consumer1收到并回复："+message;
    }
}
