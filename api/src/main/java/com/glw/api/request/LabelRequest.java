package com.glw.api.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @author : glw
 * @date : 2020/4/12
 * @time : 12:36
 * @Description : 标签请求对象
 */
@Data
@ApiModel(value = "标签请求对象")
public class LabelRequest implements Serializable {

    @ApiModelProperty(value = "标签ID")
    private Integer id;

    @ApiModelProperty(value = "标签名称")
    private String labelname;

    @ApiModelProperty(value = "状态")
    private String state;

    @ApiModelProperty(value = "使用数量")
    private Long count;

    @ApiModelProperty(value = "是否推荐")
    private String recommend;

    @ApiModelProperty(value = "粉丝数")
    private Long fans;
}
