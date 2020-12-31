package com.pushPlatform.service;

import java.util.List;

import com.pushPlatform.entity.Message;

public interface MessageService {

	List<Message> getMessageList();

	List<Message> getUserMessageList(String guid);
}
