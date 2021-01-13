package com.pushPlatform.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pushPlatform.dao.MessageDao;
import com.pushPlatform.entity.Message1;
import com.pushPlatform.entity.Push_message;
import com.pushPlatform.service.MessageService;

@Service("messageService")
public class MessageServiceImpl implements MessageService {

	@Autowired
	private MessageDao messageDao;

	@Override
	public List<Message1> getUserMessageList(String guid) {
		return messageDao.getUserMessageList(guid);
	}

	@Override
	public List<Push_message> getUserPushMessageList(String guid) {
		return messageDao.getUserPushMessageList(guid);
	}

}
