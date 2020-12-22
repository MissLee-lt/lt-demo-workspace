package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("springboot")
public class TestController {

	@RequestMapping("/test")
	@ResponseBody
	public String testDemo(String name, String info) {
		//path访问路径：http://127.0.0.1:8080/springboot/test
		return "Hello " + name + " , " + info + " ! ";
	}


}
