package com.czy.user.mgt.error;

import com.czy.commons.error.api.ProjectModule;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum UserMgtProjectCodes implements ProjectModule {
    /**
     * 登录模块
     */
    LOGIN(1, 1, "用户中心", "登录模块"),
    /**
     * 用户管理模块
     */
    USER(1, 2, "用户中心", "用户模块");

    private int projectCode;
    private int moduleCode;
    private String projectName;
    private String moduleName;
}
