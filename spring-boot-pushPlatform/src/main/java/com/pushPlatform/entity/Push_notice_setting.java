package com.pushPlatform.entity;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@ApiModel("push_notice_settingEntityClass")
public class Push_notice_setting {

	@Id
	private String _id;

	@ApiModelProperty(notes = "用户特定ID", example = "idiwojjgojort…")
	private String guid;

	private List<Settings> settings;

	@ApiModelProperty(notes = "创建用户（FC名称）", example = "UpdateNoticeSettingFc")
	private String createBy;

	@ApiModelProperty(notes = "创建时间", example = "2020-11-22 13:13:00.000")
	private Date createTime;

	@ApiModelProperty(notes = "更新用户（FC名称）", example = "UpdateNoticeSettingFc")
	private String updateBy;

	@ApiModelProperty(notes = "更新时间", example = "2020-11-22 13:13:00.000")
	private Date updateTime;

	@Override
	public String toString() {
		return "Push_notice_setting [_id=" + _id + ", guid=" + guid + ", settings=" + settings + ", createBy="
				+ createBy + ", createTime=" + createTime + ", updateBy=" + updateBy + ", updateTime=" + updateTime
				+ "]";
	}

	public Push_notice_setting(String _id, String guid, List<Settings> settings, String createBy, Date createTime,
			String updateBy, Date updateTime) {
		super();
		this._id = _id;
		this.guid = guid;
		this.settings = settings;
		this.createBy = createBy;
		this.createTime = createTime;
		this.updateBy = updateBy;
		this.updateTime = updateTime;
	}

	public Push_notice_setting(String guid, List<Settings> settings, String createBy, Date createTime, String updateBy,
			Date updateTime) {
		super();
		this.guid = guid;
		this.settings = settings;
		this.createBy = createBy;
		this.createTime = createTime;
		this.updateBy = updateBy;
		this.updateTime = updateTime;
	}

	public Push_notice_setting() {
		super();
		// TODO 自動生成されたコンストラクター・スタブ
	}

}
