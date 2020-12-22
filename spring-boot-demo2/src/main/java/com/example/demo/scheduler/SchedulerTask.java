package com.example.demo.scheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class SchedulerTask {
	private int count = 1;

	@Scheduled(cron = "*/2 * * * * ?")
	private void process() {
		System.out.println("这是第" + (count++) + "个自动任务");
	}

}
