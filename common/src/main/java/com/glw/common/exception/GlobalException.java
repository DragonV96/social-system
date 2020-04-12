package com.glw.common.exception;

import com.glw.common.enums.ErrorCode;
import lombok.Getter;

/**
 * @author : glw
 * @date : 2020/3/5
 * @time : 20:23
 * @Description : 全局异常对象
 */
@Getter
public class GlobalException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    private ErrorCode errorCode;

    public GlobalException(ErrorCode errorCode) {
        super(errorCode.getMsg());
        this.errorCode = errorCode;
    }
}
