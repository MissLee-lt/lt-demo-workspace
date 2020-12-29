package com.push.controller;

import java.util.List;

import org.bson.Document;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mongodb.client.MongoCollection;
import com.push.config.MongoDBJDBC;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;


@Api(value="Message-API",description="メッセージ一覧取得")
@RestController
@RequestMapping("/messageController")
public class MessageController {

	//get/{guid}
	@ApiOperation(value = "メッセージ一覧取得", notes = "根据guid获取消息列表")
	@ApiImplicitParam(name = "guid", value = "用户特定ID", required = true, dataType = "String", paramType = "path")
	@RequestMapping(value = "/{guid}", method = RequestMethod.GET)
	@ApiResponses({
		@ApiResponse(code = 200, message = "请求成功"),
//		@ApiResponse(code = 400, message = "请求参数没填好"),
		@ApiResponse(code = 401, message = "未授权：登录失败"),
		@ApiResponse(code = 403, message = "ACL禁止访问资源"),
		@ApiResponse(code = 404, message = "请求路径没有或者页面跳转路径不对")
	})
	public List getUserMessageList(@PathVariable String guid){
//		List<Message> messageList = new ArrayList<Message>();
//		for(int i = 0; i < 5; i++) {
//			Message message = new Message();
//			message.setGuid("guid");
//			message.setReadStatus(0);
//			message.setCategory("P81");
//			message.setTitle("【疏忽提醒】");
//			message.setMessage("您的车辆有疏忽提醒" + i);
//			messageList.add(message);
//		}
//		return messageList;

		MongoDBJDBC mongoDb = new MongoDBJDBC();
		MongoCollection<Document> collection = mongoDb.connectMongoDB();
		List<String> list = mongoDb.query(collection,"guid");
		return list;
	}
}
