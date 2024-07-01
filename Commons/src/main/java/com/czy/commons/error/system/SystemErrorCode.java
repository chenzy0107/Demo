package com.czy.commons.error.system;

import com.czy.commons.error.api.ErrorCode;
import com.czy.commons.error.manager.ErrorManager;
import lombok.Getter;

@Getter
public enum SystemErrorCode implements ErrorCode {

    SUCCESS(0, "ok"),
    SYSTEM_ERROR(1, "system error");

    private final int nodeCode;
    private final String msg;

    SystemErrorCode(int nodeCode, String msg) {
        this.nodeCode = nodeCode;
        this.msg = msg;
        ErrorManager.register(SystemProjectModule.INSTANCE, this);
    }


    @Override
    public int getNodeCode() {
        return nodeCode;
    }
}
