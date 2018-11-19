package com.gu.springdemo1;

import com.gu.springdemo1.jms.Produce;
import com.gu.springdemo1.sys.dao.UserDao;
import com.gu.springdemo1.sys.entity.User;
import org.apache.activemq.command.ActiveMQQueue;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.jms.Destination;

@RunWith(SpringRunner.class)
@SpringBootTest     //测试类开头需添加
public class Springdemo1ApplicationTests {
	@Autowired
	private Produce produce;
	/*@Autowired
	private UserMapper userMapper;*/
	@Autowired
	private UserDao userDao;

	@Test
	public void contextLoads() {
		//队列名称
		Destination destination = new ActiveMQQueue("queueTest");


		for (int i=0;i<100;i++){
			produce.sendMessage(destination,"消息"+i);
		}
		Destination destination1 = new ActiveMQQueue("queueTest1");

		produce.sendMessage(destination1,"队列queueTest1消息");

	}
	@Test
	public void test(){
		Destination destination = new ActiveMQQueue("queueTest222");

		produce.sendMessage(destination,"队列queueTest222消息");
	}

	/*@Test
	public void mybatisTest(){
		userMapper.insert("1","张三",21,"北京市");
		User user = userMapper.findUserByName("张三");
		//添加断言，判断是否相等
		Assert.assertEquals("张三",user.getName());
	}*/

	@Test
	public void userDaoTest(){
		User user = userDao.findUserByName("张三");
		Assert.assertEquals("张三",user.getName());
	}

}
