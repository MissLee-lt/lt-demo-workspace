package com.pushPlatform.entity;

import java.io.Serializable;

import org.springframework.data.annotation.Id;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@ApiModel("messageEntityClass")
public class Message implements Serializable {

//	private static final long serialVersionUID = 1L;

	@Id
	private String _id;

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

	@Override
	public String toString() {
		return "Message [_id=" + _id + ", guid=" + guid + ", readStatus=" + readStatus + ", category=" + category
				+ ", title=" + title + ", message=" + message + "]";
	}

	public Message(String _id, String guid, Integer readStatus, String category, String title, String message) {
		super();
		this._id = _id;
		this.guid = guid;
		this.readStatus = readStatus;
		this.category = category;
		this.title = title;
		this.message = message;
	}

	public Message(String guid, Integer readStatus, String category, String title, String message) {
		super();
		this.guid = guid;
		this.readStatus = readStatus;
		this.category = category;
		this.title = title;
		this.message = message;
	}

	public Message() {
		super();
	}

}
