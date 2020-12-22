package com.example.demo.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

@Api(value="Demo-API", description="测试Demo")
@RestController
@RequestMapping("/demo")
public class UserController {

	static Map<String, User> users = Collections.synchronizedMap(new HashMap<String, User>());

	//1.post
	@ApiOperation(value = "test-创建对象", notes = "根据User对象创建用户")
	@RequestMapping(value = "", method = RequestMethod.POST)
	public String postUser(User user, @RequestParam(defaultValue = "false") boolean flag, String version) {
		System.out.println("添加用户" + user.toString());
		return "ok";
	}

	//2.get
	@ApiOperation(value = "test-获取列表", notes = "返回List<?>类型信息的JSON")
	@RequestMapping(value = {""}, method=RequestMethod.GET)
	public List<User> getUserList(){
		List<User> users = new ArrayList<User>();
		for(int q=1;q<10;q++) {
			User user = new User();
			user.setUsername("LiTian" + q);
			user.setPassword("123456-" + q);
			users.add(user);
		}
		return users;
	}

	//3.get/{username}
	@ApiOperation(value = "test-获取详细信息", notes = "根据username来获取详细信息")
	//TODO：描述容器
	@ApiImplicitParam(name = "username", value = "用户username", required = true, dataType = "String", paramType = "path")
	@RequestMapping(value = "/{username}", method = RequestMethod.GET)
	public User getUser(@PathVariable String username) {
		User user = new User();
		System.out.println("获取username为" + username + "用户");
		user.setUsername(username);
		return user;
	}

	//4.delete
	@ApiOperation(value = "test-删除用户", notes = "根据url的username来指定删除对象")
    @ApiImplicitParam(name = "username", value = "用户username", required = true, dataType = "String", paramType = "path")
    @RequestMapping(value = "/{username}", method = RequestMethod.DELETE)
	public String deleteUser(@PathVariable String username) {
		System.out.println("删除username为" + username + "的用户");
		return "ok";
	}

}
