package com.mongo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mongo.entity.User;
import com.mongo.service.UserService;

/**
 * user控制器
 * @author li.tian
 *
 */
@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping("/get/{id}")
	public User getUser(@PathVariable int id) {
		return userService.getUser(id);
	}

	@RequestMapping("/delete/{id}")
	public String delete(@PathVariable int id) {
		userService.remove(id);
		return "delete success";
	}

	@RequestMapping("/add")
	public String insert() {
		User user = new User(1, "litian", 26);
		userService.insert(user);
		return "success";
	}

	@RequestMapping("/insert")
	public String insertAll() {
		List<User> list = new ArrayList<>();
		for(int i = 10; i < 15; i++) {
			list.add(new User(i, "name" + i, i));
		}
		userService.insertAll(list);
		return "success";
	}

	@RequestMapping("/find/all")
	public List<User> find(){
		return userService.findAll();
	}

//	@RequestMapping("/find/{start}")
//	public List<User> findByPage(@PathVariable int start, User user){
//		Pageable pageable = new PageRequest(start, 2);
//		return userService.findByPage(user, pageable);
//
//	}

	@RequestMapping("/update/{id}")
	public String update(@PathVariable int id) {
		User user = new User(id, "Bob"+1, 10);
		userService.update(user);
		return "success";
	}
}
