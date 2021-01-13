package com.pushPlatform.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@ApiModel("settingsEntityClass")
public class Settings {

	@ApiModelProperty(notes = "消息类别", example = "C01")
	private String category;

	@ApiModelProperty(notes = "通知设定状态<br/> 1：通知有效 <br/> 0：通知无效", example = "1")
	private Boolean settingStatus;

	@Override
	public String toString() {
		return "Settings [category=" + category + ", settingStatus=" + settingStatus + "]";
	}

	public Settings(String category, Boolean settingStatus) {
		super();
		this.category = category;
		this.settingStatus = settingStatus;
	}

	public Settings() {
		super();
		// TODO 自動生成されたコンストラクター・スタブ
	}

}
