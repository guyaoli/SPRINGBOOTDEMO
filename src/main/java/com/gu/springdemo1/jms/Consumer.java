package com.gu.springdemo1.jms;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Component;

//消息消费者的类必须加上@Component或者@Service,消息消费者类会被委派给Linstener类，实现消息驱动pojo
@Component
public class Consumer {
    //监听队列queueTest
    @JmsListener(destination = "queueTest")
    public void reviewMessage(String message){
        System.out.println("consumer接收到的消息是:"+message);
    }

    @JmsListener(destination = "queueTest222")
    public void reviewMessage1(String message){
        System.out.println("consumer222接收到的消息是:"+message);
    }

}
