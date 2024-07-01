package com.czy.user.mgt.error;

import com.czy.commons.error.api.ProjectModule;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum UserMgtProjectCode implements ProjectModule {
    /**
     * 登录模块
     */
    LOGIN(1, "用户中心", 0, "登录模块"),
    /**
     * 用户管理模块
     */
    USER(1, "用户中心", 1, "用户模块");

    private int projectCode;
    private String projectName;
    private int moduleCode;
    private String moduleName;
}
