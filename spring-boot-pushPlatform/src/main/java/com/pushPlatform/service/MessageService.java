package com.pushPlatform.service;

import java.util.List;

import com.pushPlatform.entity.Message1;
import com.pushPlatform.entity.Push_message;

public interface MessageService {

	List<Message1> getUserMessageList(String guid);

	List<Push_message> getUserPushMessageList(String guid);
}
