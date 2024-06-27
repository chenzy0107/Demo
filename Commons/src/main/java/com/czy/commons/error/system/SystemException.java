package com.czy.commons.error.system;

import com.czy.commons.error.api.ErrorCode;
import com.czy.commons.error.api.ProjectModule;
import com.czy.commons.error.exception.BaseException;
import com.czy.commons.error.manager.ErrorInfo;

public class SystemException extends BaseException {

    public SystemException(String message) {
        super(message);
    }

    public SystemException(String message, Throwable cause) {
        super(message, cause);
    }

    public SystemException(Throwable cause) {
        super(cause);
    }

    public SystemException(ErrorInfo errorInfo) {
        super(errorInfo);
    }

    public SystemException(ErrorCode errorCode) {
        super(errorCode);
    }

    public SystemException(ErrorCode errorCode, Object... args) {
        super(errorCode, args);
    }

    @Override
    public ProjectModule projectModule() {
        return SystemProjectModule.INSTANCE;
    }
}
