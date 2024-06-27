package com.czy.commons.error.system;

import com.czy.commons.error.api.ErrorCode;
import com.czy.commons.error.manager.ErrorManager;
import lombok.Getter;

@Getter
public enum SystemErrorCodes implements ErrorCode {

    SUCCESS(0, "ok"),
    SYSTEM_ERROR(1, "system error");

    private final int nodeNum;
    private final String msg;

    SystemErrorCodes(int nodeNum, String msg) {
        this.nodeNum = nodeNum;
        this.msg = msg;
        ErrorManager.register(SystemProjectModule.INSTANCE, this);
    }


    @Override
    public int getNodeCode() {
        return 0;
    }
}
