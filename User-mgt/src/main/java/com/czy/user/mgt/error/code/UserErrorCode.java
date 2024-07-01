package com.czy.user.mgt.error.code;

import com.czy.commons.error.api.ErrorCode;
import com.czy.commons.error.manager.ErrorManager;
import com.czy.user.mgt.error.UserMgtProjectCode;
import lombok.Getter;

@Getter
public enum UserErrorCode implements ErrorCode {
    /**
     * 用户不存在
     */
    USER_NOT_EXIST(0, "用户名不存在"),
    /**
     * 密码错误
     */
    PASSWORD_ERROR(1, "密码错误");

    private final int nodeCode;
    private final String msg;

    UserErrorCode(int nodeCode, String msg) {
        this.nodeCode = nodeCode;
        this.msg = msg;
        // 注册错误码，也就是绑定这个错误码属于哪个模块的
        ErrorManager.register(UserMgtProjectCode.USER, this);
    }


    @Override
    public int getNodeCode() {
        return nodeCode;
    }
}
