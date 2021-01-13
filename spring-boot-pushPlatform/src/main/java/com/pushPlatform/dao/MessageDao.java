package com.pushPlatform.dao;

import java.util.List;

import com.pushPlatform.entity.Message1;
import com.pushPlatform.entity.Push_message;

/**
 * MessageDao接口定义
 * @author li.tian
 *
 */
public interface MessageDao {

	List<Message1> getUserMessageList(String guid);

	List<Push_message> getUserPushMessageList(String guid);
}
