package com.glw.common.enums;

import lombok.Getter;

/**
 * @author : glw
 * @date : 2019/12/26
 * @time : 18:12
 * @Description : 错误码
 */
@Getter
public enum ErrorCode {

    SUCCESS(20000, "执行成功"),
    ERROR(20001, "执行失败"),
    LOGIN_ERROR(20002, "用户名或密码错误"),
    ACCESS_ERROR(20003, "权限不足"),
    REMOTE_ERROR(20004, "远程调用失败"),
    REPEAT_ERROR(20005, "重复操作"),

    BIND_ERROR(90001, "端口绑定错误"),
    SERVER_ERROR(90002, "服务器内部错误"),
    PARAM_EMPTY(90003, "参数为空"),
    PARAM_ERROR(90004, "参数错误"),
    NOT_EXIST(90004, "数据不存在");

    /** 错误码 */
    private int code;

    /** 错误描述 */
    private String msg;

    ErrorCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
