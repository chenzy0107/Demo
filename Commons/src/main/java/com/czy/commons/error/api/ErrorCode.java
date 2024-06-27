package com.czy.commons.error.api;

import com.czy.commons.error.manager.ErrorManager;

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
