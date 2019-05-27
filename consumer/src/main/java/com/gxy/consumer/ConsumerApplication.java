package com.gxy.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import com.gxy.consumer.quickstart.QuickstartConsumer;

@SpringBootApplication
@EnableDubboConfiguration
public class ConsumerApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConfigurableApplicationContext run =
				SpringApplication.run(ConsumerApplication.class, args);
		
		QuickstartConsumer quickstartConsumer = (QuickstartConsumer) run.getBean("quickstartConsumer");
		
		quickstartConsumer.sendMessage("童鞋们都能找到一个百万年薪的工作");
	}

}
