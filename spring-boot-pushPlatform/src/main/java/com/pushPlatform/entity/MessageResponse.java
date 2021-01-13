package com.pushPlatform.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@ApiModel("messageResponseEntityClass")
public class MessageResponse {

	@ApiModelProperty(notes = "处理ID", example = "xxxxxxxxxxxxxxxUUIDxxxxxxxxxxxxxxxxxxxxxxx")
	private String transactionId;

	@ApiModelProperty(notes = "用户特定ID", example = "idiwojjgojort…")
	private String guid;

	@ApiModelProperty(notes = "消息读取状态：<br/>1:已读<br/>2:未读", example = "1")
	private Integer readStatus;

	private Message message;

	@Override
	public String toString() {
		return "MessageResponse [transactionId=" + transactionId + ", guid=" + guid + ", readStatus=" + readStatus
				+ ", message=" + message + "]";
	}

	public MessageResponse(String transactionId, String guid, Integer readStatus, Message message) {
		super();
		this.transactionId = transactionId;
		this.guid = guid;
		this.readStatus = readStatus;
		this.message = message;
	}

	public MessageResponse() {
		super();
		// TODO 自動生成されたコンストラクター・スタブ
	}

}
