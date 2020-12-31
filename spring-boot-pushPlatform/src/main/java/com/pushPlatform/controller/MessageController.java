package com.pushPlatform.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pushPlatform.entity.Message;
import com.pushPlatform.service.MessageService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
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

//	@ApiOperation(value = "获取所有消息列表", notes = "获取所有消息列表")
//	@RequestMapping(value = {"/findAll"}, method = RequestMethod.GET)
//	@ApiResponses({
//		@ApiResponse(code = 200, message = "请求成功"),
////		@ApiResponse(code = 400, message = "请求参数没填好"),
//		@ApiResponse(code = 401, message = "未授权：登录失败"),
//		@ApiResponse(code = 403, message = "ACL禁止访问资源"),
//		@ApiResponse(code = 404, message = "请求路径没有或者页面跳转路径不对")
//	})
//	public List<Message> getMessageList(){
//		return messageService.getMessageList();
//	}


	@ApiOperation(value = "メッセージ一覧取得", notes = "根据guid获取消息列表")
	@ApiImplicitParam(name = "guid", value = "用户特定ID", required = true,dataType = "String", paramType = "path")
	@RequestMapping(value = "/findAll/{guid}", method = RequestMethod.GET)
	@ApiResponses({
		@ApiResponse(code = 200, message = "请求成功"),
//		@ApiResponse(code = 400, message = "请求参数没填好"),
		@ApiResponse(code = 401, message = "未授权：登录失败"),
		@ApiResponse(code = 403, message = "ACL禁止访问资源"),
		@ApiResponse(code = 404, message = "请求路径没有或者页面跳转路径不对")
	})
	public List<Message> getUserMessageList(@PathVariable String guid){
		return messageService.getUserMessageList(guid);
	}
}
