package com.czy.base.error.api;

import com.czy.base.error.manager.ErrorManager;

public interface ErrorCode {
    int getNodeCode();

    String getMsg();

    default int getCode() {
        return ErrorManager.genCode(this);
    }

    default ProjectModule projectModule(){
        return ErrorManager.projectModule(this);
    }
}
