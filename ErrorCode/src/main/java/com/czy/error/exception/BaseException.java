package com.czy.error.exception;

import com.czy.error.api.ErrorCode;
import com.czy.error.api.ProjectModule;
import com.czy.error.manager.ErrorInfo;

public abstract class BaseException extends Exception implements IErrorCodeException {

    final ErrorInfo errorInfo;

    protected BaseException(String message) {
        super(message);
        this.errorInfo = ErrorInfo.parse(message);
    }

    protected BaseException(String message, Throwable cause) {
        super(message, cause);
        this.errorInfo = ErrorInfo.parse(message);
    }

    protected BaseException(Throwable cause) {
        super(cause);
        this.errorInfo = ErrorInfo.parse(cause.getMessage());
    }

    protected BaseException(ErrorInfo errorInfo) {
        super(errorInfo.toString());
        this.errorInfo = errorInfo;
    }

    protected BaseException(ErrorCode errorCode) {
        this(ErrorInfo.parse(errorCode));
        ProjectModule.check(projectModule(), errorCode.projectModule());
    }

    protected BaseException(ErrorCode errorCode, Object... args) {
        this(ErrorInfo.parse(errorCode, args));
        ProjectModule.check(projectModule(), errorCode.projectModule());
    }

    @Override
    public ErrorInfo getErrorInfo() {
        return errorInfo;
    }
}
