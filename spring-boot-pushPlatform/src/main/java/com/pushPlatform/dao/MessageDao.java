package com.pushPlatform.dao;

import java.util.List;

import com.pushPlatform.entity.Message;

/**
 * MessageDao接口定义
 * @author li.tian
 *
 */
public interface MessageDao {

	List<Message> getMessageList();

	List<Message> getUserMessageList(String guid);
}
