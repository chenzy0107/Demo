package com.czy.commons.error.manager;

import com.czy.commons.error.api.ErrorCode;
import com.czy.commons.error.system.SystemErrorCodes;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.slf4j.helpers.MessageFormatter;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Getter
@AllArgsConstructor
public class ErrorInfo {
    static final Map<Integer, ErrorInfo> NO_PARAM_CODES_MAP = new ConcurrentHashMap<>();
    static final Map<String, ErrorInfo> ERROR_MSG_CODES_MAP = new ConcurrentHashMap<>();

    private final int code;
    private final String msg;

    public static ErrorInfo parse(String msg) {
        return ERROR_MSG_CODES_MAP.computeIfAbsent(msg, m -> new ErrorInfo(SystemErrorCodes.SYSTEM_ERROR.getCode(), msg));
    }

    public static ErrorInfo parse(ErrorCode errorCode) {
        int code = errorCode.getCode();
        return NO_PARAM_CODES_MAP.computeIfAbsent(code, c -> new ErrorInfo(c, errorCode.getMsg()));
    }

    public static ErrorInfo parse(ErrorCode errorCode, Object... args) {
        String msg = MessageFormatter.arrayFormat(errorCode.getMsg(), args).getMessage();
        return new ErrorInfo(errorCode.getCode(), msg);
    }

    @Override
    public String toString() {
        return "code=" + code + ",msg=" + msg;
    }
}
