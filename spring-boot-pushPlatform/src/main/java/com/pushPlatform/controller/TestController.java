package com.pushPlatform.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

	@RequestMapping("/getFile")
	public String getFile() {
		String fileContent = "{\"category\":\"C01\",\"title\":\"【疏忽提醒】\",\"message\":\"您的车辆有疏忽提醒\",\"type\":\"01\",\"requestId\":\"a11a24fb-d10c-4a08-8243-a5cb0452f400\",\"sendTime\":\"2021-01-13T10:13:00.000Z\",\"vin\":[\"aaaaa\",\"bbbbb\",\"ccccc\"]}";
		return fileContent;
	}
}
