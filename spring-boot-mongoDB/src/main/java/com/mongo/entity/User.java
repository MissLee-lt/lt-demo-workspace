package com.mongo.entity;

import java.io.Serializable;

import org.springframework.data.annotation.Id;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class User implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	private String _id;
	private int id;
	private String name;
	private int age;

	public String toString() {
		return "User [_id=" + _id + ", id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	public User() {
		super();
	}

	public User(String _id, int id, String name, int age) {
		super();
		this._id = _id;
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public User(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}


}
