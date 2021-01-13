package com.pushPlatform.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.pushPlatform.dao.MessageDao;
import com.pushPlatform.entity.Message1;
import com.pushPlatform.entity.Push_message;

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
	private Query query;

	/**
	 * notes：根据guid查询Message列表
	 */
	@Override
	public List<Message1> getUserMessageList(String guid) {
		Query query = new Query(Criteria.where("guid").is(guid)).limit(20);
		return mongoTemplate.find(query, Message1.class);
	}

	/**
	 * notes：根据guid查询Push_message列表
	 */
	@Override
	public List<Push_message> getUserPushMessageList(String guid) {
		Query query = new Query();
		query.addCriteria(Criteria.where("guid").is(guid));
		query.fields().include("transactionId")
			.include("guid")
			.include("readStatus")
			.include("message");
		return mongoTemplate.find(query, Push_message.class);
	}

}
