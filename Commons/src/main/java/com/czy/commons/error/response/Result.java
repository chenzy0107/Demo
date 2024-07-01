package com.czy.commons.error.response;

import com.czy.commons.error.api.ErrorCode;
import com.czy.commons.error.manager.ErrorInfo;
import com.czy.commons.error.system.SystemErrorCode;
import lombok.Getter;

@Getter
public class Result<T> extends ErrorInfo {

    private T data;

    public Result(int code, String msg) {
        super(code, msg);
    }


    public static <T> Result<T> success(T data) {
        SystemErrorCode success = SystemErrorCode.SUCCESS;
        Result<T> result = new Result<>(success.getCode(), success.getMsg());
        result.data = data;
        return result;
    }

    public static <T> Result<T> error(ErrorCode errorCode) {
        return new Result<>(errorCode.getCode(), errorCode.getMsg());
    }

    public static Result<String> error(Integer code, String msg) {
        return new Result<>(code, msg);
    }

}
