package com.pushPlatform.entity;

import java.util.Date;

import org.springframework.data.annotation.Id;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@ApiModel("push_userEntityClass")
public class Push_user {

	@Id
	private String _id;

	@ApiModelProperty(notes = "极光推送ID", example = "191e35f7e0f0931a725")
	private String jpushId;

	@ApiModelProperty(notes = "车辆识别番号", example = "JTHAAABH6L0000000")
	private String vin;

	@ApiModelProperty(notes = "车主ID", example = "Le3944@")
	private String ownersId;

	@ApiModelProperty(notes = "用户特定ID", example = "idiwojjgojort...")
	private String guid;

	@ApiModelProperty(notes = "电话号码", example = "13900000000")
	private String phoneNo;

	@ApiModelProperty(notes = "创建用户（FC名称）", example = "PushIdDevicetokenFc")
	private String createBy;

	@ApiModelProperty(notes = "创建时间", example = "2020-11-22 13:13:00.000")
	private Date createTime;

	@ApiModelProperty(notes = "更新用户（FC名称）", example = "PushIdDevicetokenFc")
	private String updateBy;

	@ApiModelProperty(notes = "更新时间", example = "2020-12-22 13:13:00.000")
	private Date updateTime;

	@Override
	public String toString() {
		return "Push_user [_id=" + _id + ", jpushId=" + jpushId + ", vin=" + vin + ", ownersId=" + ownersId + ", guid="
				+ guid + ", phoneNo=" + phoneNo + ", createBy=" + createBy + ", createTime=" + createTime
				+ ", updateBy=" + updateBy + ", updateTime=" + updateTime + "]";
	}

	public Push_user(String _id, String jpushId, String vin, String ownersId, String guid, String phoneNo,
			String createBy, Date createTime, String updateBy, Date updateTime) {
		super();
		this._id = _id;
		this.jpushId = jpushId;
		this.vin = vin;
		this.ownersId = ownersId;
		this.guid = guid;
		this.phoneNo = phoneNo;
		this.createBy = createBy;
		this.createTime = createTime;
		this.updateBy = updateBy;
		this.updateTime = updateTime;
	}

	public Push_user(String jpushId, String vin, String ownersId, String guid, String phoneNo, String createBy,
			Date createTime, String updateBy, Date updateTime) {
		super();
		this.jpushId = jpushId;
		this.vin = vin;
		this.ownersId = ownersId;
		this.guid = guid;
		this.phoneNo = phoneNo;
		this.createBy = createBy;
		this.createTime = createTime;
		this.updateBy = updateBy;
		this.updateTime = updateTime;
	}

	public Push_user() {
		super();
		// TODO 自動生成されたコンストラクター・スタブ
	}

}
