package com.mongo.dao;

import java.util.List;

import org.springframework.data.domain.Pageable;

import com.mongo.entity.User;

/**
 * userDao接口定义
 *
 * @author li.tian
 *
 */
public interface UserDao {

	List<User> findAll();

	User getUser(Integer id);

	void update(User user);

	void insert(User user);

	void insertAll(List<User> users);

	void remove(Integer id);

	List<User> findByPage(User user, Pageable pageable);

}
