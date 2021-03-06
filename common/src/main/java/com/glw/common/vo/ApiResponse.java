package com.glw.common.vo;

import com.glw.common.enums.ErrorCode;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author : glw
 * @date : 2020/4/11
 * @time : 23:44
 * @Description : 通用响应对象
 */
@Data
@ApiModel(value = "通用响应对象")
public class ApiResponse<T> {

    @ApiModelProperty(value = "数据状态码")
    private int code;

    @ApiModelProperty(value = "状态码对应描述")
    private String message;

    @ApiModelProperty(value = "标志")
    private Boolean flag;

    @ApiModelProperty(value = "数据")
    private T data;

    public ApiResponse() {
        this.code = ErrorCode.SUCCESS.getCode();
        this.message = ErrorCode.SUCCESS.getMsg();
        this.flag = true;
    }

    public ApiResponse(T data) {
        this.code = ErrorCode.SUCCESS.getCode();
        this.message = ErrorCode.SUCCESS.getMsg();
        this.flag = true;
        this.data = data;
    }

    public ApiResponse(ErrorCode errorCode) {
        this.code = errorCode.getCode();
        this.message = errorCode.getMsg();
        this.flag = false;
    }

    /**
     * 返回成功
     * @param data
     * @param <T>
     * @return
     */
    public static <T> ApiResponse<T> success(T data) {
        return new ApiResponse<T>(data);
    }

    /**
     * 返回成功(无参数)
     * @param <T>
     * @return
     */
    public static <T> ApiResponse<T> success() {
        return new ApiResponse<T>();
    }

    /**
     * 返回失败
     * @param errorCode
     * @param <T>
     * @return
     */
    public static <T> ApiResponse<T> error(ErrorCode errorCode) {
        return new ApiResponse<T>(errorCode);
    }
}
