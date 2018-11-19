
package com.gu.springdemo1.jms;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Service;

@Service("consumer2")
public class Consumer2 {
//    @JmsListener(destination = "queueTest")
//    @SendTo("returnQueueTest1")
    public void reviewMessage(String message){
//        System.out.println("consumer2接收到的消息是:"+message);
//        return "consumer2收到并回复："+message;
    }
}




