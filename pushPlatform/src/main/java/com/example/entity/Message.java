package com.example.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("messageEntityClass")
public class Message {

	@ApiModelProperty(notes = "用户特定ID", example = "idiwojjgojort…")
	private String guid;

	@ApiModelProperty(notes = "消息读取状态 <br/> 1：已读 <br/> 0：未读", example = "0")
	private Integer readStatus;

	@ApiModelProperty(notes = "消息类别", example = "P81")
	private String category;

	@ApiModelProperty(notes = "消息标题", example = "【疏忽提醒】")
	private String title;

	@ApiModelProperty(notes = "消息文本内容", example = "您的车辆有疏忽提醒。")
	private String message;

	public String getGuid() {
		return guid;
	}

	public void setGuid(String guid) {
		this.guid = guid;
	}

	public Integer getReadStatus() {
		return readStatus;
	}

	public void setReadStatus(Integer readStatus) {
		this.readStatus = readStatus;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
