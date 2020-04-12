package com.glw.api.request;

import lombok.Data;

import java.io.Serializable;

/**
 * @author : glw
 * @date : 2020/4/12
 * @time : 12:36
 * @Description : 面板请求对象
 */
@Data
public class LabelRequest implements Serializable {
    /**
     * 标签ID
     */
    private Integer id;

    /**
     * 标签名称
     */
    private String labelname;

    /**
     * 状态
     */
    private String state;

    /**
     * 使用数量
     */
    private Long count;

    /**
     * 是否推荐
     */
    private String recommend;

    /**
     * 粉丝数
     */
    private Long fans;
}
