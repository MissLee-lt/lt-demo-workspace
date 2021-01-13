package com.pushPlatform.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@ApiModel("messageEntityClass")
public class Message {

	@ApiModelProperty(notes = "消息类别", example = "P81")
	private String category;

	@ApiModelProperty(notes = "消息标题", example = "【疏忽提醒】")
	private String title;

	@ApiModelProperty(notes = "消息文本内容", example = "您的车辆有疏忽提醒。")
	private String message;

	@Override
	public String toString() {
		return "Message [category=" + category + ", title=" + title + ", message=" + message + "]";
	}

	public Message(String category, String title, String message) {
		super();
		this.category = category;
		this.title = title;
		this.message = message;
	}

	public Message() {
		super();
		// TODO 自動生成されたコンストラクター・スタブ
	}

}
