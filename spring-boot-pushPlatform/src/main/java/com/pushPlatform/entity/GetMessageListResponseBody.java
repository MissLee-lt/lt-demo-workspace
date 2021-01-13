package com.pushPlatform.entity;

import java.util.List;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@ApiModel("getMessageListResponseBodyEntityClass")
public class GetMessageListResponseBody {

	@ApiModelProperty(notes = "应答结果代码 &nbsp;应答结果内容<br/>* \"A02105000\" OK.<br/>* \"A02105001\" Request resolution failure.<br/>* \"A02105002\" Required header item {0} missing.<br/>* \"A02105003\" [x-api-key] verify failure.<br/>* \"A02105004\" Required body item {0} missing.<br/>* \"A02105999\" Internal Server Error<br/>", example = "")
	private String resultCode;

	@ApiModelProperty(notes = "应答结果内容描述", example = "")
	private String resultMessage;

	@ApiModelProperty(notes = "成功的返回结果", example = "")
	private List<MessageResponse> data;

}
