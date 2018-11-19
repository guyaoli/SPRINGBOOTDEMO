package com.gu.springdemo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RequestMapping("test")
@RestController
@EnableScheduling   //使用定时任务发送消息
public class Springdemo1Application {

	public static void main(String[] args) {
		SpringApplication.run(Springdemo1Application.class, args);
	}

	@RequestMapping(method = RequestMethod.GET)
	public String test() {
		return "hello world!";
	}
}
