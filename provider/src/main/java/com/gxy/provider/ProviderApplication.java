package com.gxy.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;

@SpringBootApplication
@EnableDubboConfiguration
public class ProviderApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(ProviderApplication.class, args);
	}

}
