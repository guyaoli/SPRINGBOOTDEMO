package com.gu.springdemo1.jms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import javax.jms.Destination;


@Service("produce")
public class Produce {
    //注入JmsTemplate
    @Autowired
    private JmsTemplate jmsTemplate;


    //jmsTemplate发送消息，destination：消息队列 message：消息
    public void sendMessage(Destination destination, String message){
        jmsTemplate.convertAndSend(destination,message);
    }

    //接收回复消息
    @JmsListener(destination = "returnQueueTest")
    public void reviewMessage(String message){
        System.out.println("produce接收到的consumer1的消息："+message);
    }
    @JmsListener(destination = "returnQueueTest1")
    public void reviewMessage1(String message){
        System.out.println("consumer2的回复消息:"+message);
    }
}
