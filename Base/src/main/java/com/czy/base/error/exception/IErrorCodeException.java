package com.czy.base.error.exception;

import com.czy.base.error.api.ProjectModule;
import com.czy.base.error.manager.ErrorInfo;

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
