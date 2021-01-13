package com.pushPlatform.entity;

import java.util.Date;

import org.springframework.data.annotation.Id;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@ApiModel("push_messageEntityClass")
public class Push_message {

	@Id
	private String _id;

	@ApiModelProperty(notes = "处理ID", example = "xxxxxxxxxxxxxxxUUIDxxxxxxxxxxxxxxxxxxxxxxx")
	private String transactionId;

	@ApiModelProperty(notes = "用户特定ID", example = "idiwojjgojort…")
	private String guid;

	@ApiModelProperty(notes = "消息读取状态：<br/>1:已读<br/>2:未读", example = "1")
	private Integer readStatus;

	private Message message;

	@ApiModelProperty(notes = "创建用户", example = "PushSingeleMessageFc")
	private String createBy;

	@ApiModelProperty(notes = "推送时间", example = "2020-11-22 13:13:00.000")
	private Date createTime;

	@ApiModelProperty(notes = "更新用户", example = "GetDetailMessageFc")
	private String updateBy;

	@ApiModelProperty(notes = "更新时间", example = "2020-12-22 13:13:00.000")
	private Date updateTime;

	@Override
	public String toString() {
		return "Push_message [_id=" + _id + ", transactionId=" + transactionId + ", guid=" + guid + ", readStatus="
				+ readStatus + ", message=" + message + ", createBy=" + createBy + ", createTime=" + createTime
				+ ", updateBy=" + updateBy + ", updateTime=" + updateTime + "]";
	}

	public Push_message() {
		super();
	}

	public Push_message(String _id, String transactionId, String guid, Integer readStatus, Message message,
			String createBy, Date createTime, String updateBy, Date updateTime) {
		super();
		this._id = _id;
		this.transactionId = transactionId;
		this.guid = guid;
		this.readStatus = readStatus;
		this.message = message;
		this.createBy = createBy;
		this.createTime = createTime;
		this.updateBy = updateBy;
		this.updateTime = updateTime;
	}

	public Push_message(String transactionId, String guid, Integer readStatus, Message message, String createBy,
			Date createTime, String updateBy, Date updateTime) {
		super();
		this.transactionId = transactionId;
		this.guid = guid;
		this.readStatus = readStatus;
		this.message = message;
		this.createBy = createBy;
		this.createTime = createTime;
		this.updateBy = updateBy;
		this.updateTime = updateTime;
	}

}
