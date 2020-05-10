package com.rui.hello.handle;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

	
	@RequestMapping("/spring/hello")
	public String test(){
		return "Hello World!";
	}
}
