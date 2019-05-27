package com.gxy.provider.quickstart;

import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Service;
import com.gxy.provider.ServiceAPI;

@Component
@Service(interfaceClass = ServiceAPI.class)
public class QuickstartServiceImpl implements ServiceAPI {

	@Override
	public String sendMessage(String message) {
		// TODO Auto-generated method stub
		return "quickstart-provider-message="+message;
	}

}
