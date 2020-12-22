package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/app")
public class TestController {

	@RequestMapping("/test")
	@ResponseBody
	public String testDemo() {
		//path访问路径：http://127.0.0.1:8080/app/test
		return "Hello LiTian!";
	}

}
