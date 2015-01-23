package org.jacademie.springmvc.service.impl;

import org.jacademie.springmvc.service.HelloService;
import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {

	@Override
	public String sayHello(String name) {
		
		String result = "Hello ";
		
		if (name == null) {
			
			result = result + "World !";
		}
		else {
			result = result + name;
		}
		
		return result;
	}

}
