package com.czy.error.system;

import com.czy.error.api.ProjectModule;

public class SystemProjectModule implements ProjectModule {

    public static final SystemProjectModule INSTANCE = new SystemProjectModule();

    @Override
    public int getProjectCode() {
        return 0;
    }

    @Override
    public int getModuleCode() {
        return 0;
    }

    @Override
    public String getProjectName() {
        return "default";
    }

    @Override
    public String getModuleName() {
        return "default";
    }
}
