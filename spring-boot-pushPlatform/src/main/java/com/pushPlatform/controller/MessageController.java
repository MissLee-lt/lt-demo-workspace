package com.pushPlatform.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pushPlatform.entity.GetMessageListResponseBody;
import com.pushPlatform.entity.MessageResponse;
import com.pushPlatform.entity.Push_message;
import com.pushPlatform.service.MessageService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * message控制器
 * @author li.tian
 *
 */
@Api(value = "Message-API", description = "获取消息列表")
@RestController
@RequestMapping("/message")
public class MessageController {

	@Autowired
	private MessageService messageService;

//	@ApiOperation(value = "获取消息列表", notes = "根据guid获取消息列表")
//	@ApiImplicitParams({
//		@ApiImplicitParam(name = "guid", value = "用户特定ID", required = true, dataType = "String", paramType = "path"),
//		@ApiImplicitParam(name = "x-api-key", value = "认证", required = true, dataType = "String", paramType = "header")
//	})
//	@RequestMapping(value = "/findAll/{guid}", method = RequestMethod.GET)
//	@ApiResponses({
//		@ApiResponse(code = 200, message = "请求成功"),
////		@ApiResponse(code = 400, message = "请求参数没填好"),
//		@ApiResponse(code = 401, message = "未授权：登录失败"),
//		@ApiResponse(code = 403, message = "ACL禁止访问资源"),
//		@ApiResponse(code = 404, message = "请求路径没有或者页面跳转路径不对")
//	})
//	public List<Message1> getUserMessageList(@PathVariable String guid){
//		return messageService.getUserMessageList(guid);
//	}


	@ApiOperation(value = "获取消息列表", notes = "根据guid获取消息列表")
	@ApiImplicitParams({
		@ApiImplicitParam(name = "guid", value = "用户特定ID", required = true, dataType = "String", paramType = "path"),
		@ApiImplicitParam(name = "x-api-key", value = "认证", required = true, dataType = "String", paramType = "header")
	})
	@RequestMapping(value = "/findUserAll/{guid}", method = RequestMethod.GET)
	@ApiResponses({
		@ApiResponse(code = 200, message = "successful operation"),
		@ApiResponse(code = 400, message = "Invalid request", response=GetMessageListResponseBody.class),
		@ApiResponse(code = 500, message = "Internal Server Error", response=GetMessageListResponseBody.class)
	})
	public GetMessageListResponseBody getUserPushMessageList(@PathVariable String guid){

		GetMessageListResponseBody response = new GetMessageListResponseBody();

		List<Push_message> pushMessageList = messageService.getUserPushMessageList(guid);
		List<MessageResponse> messageResponseList = new ArrayList<MessageResponse>();
		for (Push_message push_message : pushMessageList) {
			MessageResponse messageResponse = new MessageResponse();
			messageResponse.setTransactionId(push_message.getTransactionId());
			messageResponse.setGuid(push_message.getGuid());
			messageResponse.setReadStatus(push_message.getReadStatus());
			messageResponse.setMessage(push_message.getMessage());
			messageResponseList.add(messageResponse);
		}

		response.setResultCode("A02105000");
		response.setResultMessage("");
		response.setData(messageResponseList);

		return response;
	}
}
