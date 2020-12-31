package com.pushPlatform.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.pushPlatform.dao.MessageDao;
import com.pushPlatform.entity.Message;

/**
 * MessageDao接口实现
 * @author li.tian
 *
 */
@Repository("messageDao")
public class MessageDaoImpl implements MessageDao {

	/**
	 * notes:由SpringBoot自动注入，默认配置会产生MongoTemplate这个bean
	 */
	@Autowired
	private MongoTemplate mongoTemplate;

	/**
	 * notes：查询全部Message列表
	 */
	@Override
	public List<Message> getMessageList() {
		return mongoTemplate.findAll(Message.class);
	}

	/**
	 * notes：根据guid查询Message列表
	 */
	@Override
	public List<Message> getUserMessageList(String guid) {
		Query query = new Query(Criteria.where("guid").is(guid));
		return mongoTemplate.find(query, Message.class);
	}

}
