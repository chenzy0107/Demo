package com.czy.commons.error.exception;

import com.czy.commons.error.api.ProjectModule;
import com.czy.commons.error.manager.ErrorInfo;

public interface IErrorCodeException {
    /**
     * 错误信息
     */
    ErrorInfo getErrorInfo();

    /**
     * 服务+模块信息
     */
    ProjectModule projectModule();
}
