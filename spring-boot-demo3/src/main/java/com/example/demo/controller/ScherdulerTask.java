package com.example.demo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import cn.jiguang.common.resp.APIConnectionException;
import cn.jiguang.common.resp.APIRequestException;
import cn.jpush.api.JPushClient;
import cn.jpush.api.push.PushResult;
import cn.jpush.api.push.model.Message;
import cn.jpush.api.push.model.Options;
import cn.jpush.api.push.model.Platform;
import cn.jpush.api.push.model.PushPayload;
import cn.jpush.api.push.model.audience.Audience;
import cn.jpush.api.push.model.notification.Notification;


@Component
public class ScherdulerTask {
	private int count = 1;

	private static String APP_KEY = "ca703164e78e260c9ffd6ad4";
	private static String MASTER_SECRET = "7cdc08e5a669a608a70b3b44";

	@Scheduled(cron = "*/5 * * * * ?")
	private void process() {
//		System.out.println("这是第" + (count++) + "个自动任务");
		count++;
		push(count);
	}

	public void push(int count) {

		Map<String, String> map = new HashMap<String, String>();
		map.put("title", "Spring Boot测试标题" + count);
		map.put("msg", "Spring Boot测试内容" + count);

		// notes: 创建JPushClient(极光推送的实例)
		JPushClient jpushClient = new JPushClient(MASTER_SECRET, APP_KEY);
		// notes: 推送的关键，构造一个payload（notification是推送有通知的消息）
		PushPayload payload = PushPayload.newBuilder().setPlatform(Platform.android()).setAudience(Audience.all())
				.setNotification(Notification.android(map.get("msg"), map.get("title"), map))
				.setOptions(Options.newBuilder().setApnsProduction(true).setTimeToLive(7200).build())
				.setMessage(Message.content(map.get("msg"))).build();

		PushResult pu = null;
		try {
			pu = jpushClient.sendPush(payload);
			System.out.println(pu.toString());
		} catch (APIConnectionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (APIRequestException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
