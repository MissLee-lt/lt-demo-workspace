package com.pushPlatform.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pushPlatform.dao.MessageDao;
import com.pushPlatform.entity.Message;
import com.pushPlatform.service.MessageService;

@Service("messageService")
public class MessageServiceImpl implements MessageService {

	@Autowired
	private MessageDao messageDao;

	@Override
	public List<Message> getMessageList() {
		return messageDao.getMessageList();
	}

	@Override
	public List<Message> getUserMessageList(String guid) {
		return messageDao.getUserMessageList(guid);
	}

}
