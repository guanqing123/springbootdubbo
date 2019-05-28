package com.gxy.consumer.quickstart;

import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Reference;
import com.gxy.provider.ServiceAPI;

@Component
public class QuickstartConsumer {

	@Reference(interfaceClass = ServiceAPI.class)
	ServiceAPI serviceAPI;
	
	public void sendMessage(String message) {
		System.out.println(serviceAPI.sendMessage(message));
	}
	
}