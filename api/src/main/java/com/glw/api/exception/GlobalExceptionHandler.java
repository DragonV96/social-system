package com.glw.api.exception;

import com.glw.common.enums.ErrorCode;
import com.glw.common.exception.GlobalException;
import com.glw.common.vo.ApiResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindException;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * @author : glw
 * @date : 2020/3/6
 * @time : 18:07
 * @Description : 全局异常处理
 */
@Slf4j
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public ApiResponse<String> exceptionHandler(Exception e) {
        if (e instanceof GlobalException) {
            GlobalException ex =(GlobalException) e;
            log.error("GlobalExceptionHandler exceptionHandler >>> GlobalException message = {}", ex.getErrorCode().getMsg());
            return ApiResponse.error(ex.getErrorCode());
        } else if (e instanceof BindException) {
            BindException ex = (BindException) e;
            ObjectError error = ex.getAllErrors().get(0);
            log.error("GlobalExceptionHandler exceptionHandler >>> BindException message = {}", error);
            return ApiResponse.error(ErrorCode.BIND_ERROR);
        } else {
            log.error("GlobalExceptionHandler exceptionHandler >>> Other exception message = {}", ErrorCode.SERVER_ERROR.getMsg());
            return ApiResponse.error(ErrorCode.SERVER_ERROR);
        }
    }
}
