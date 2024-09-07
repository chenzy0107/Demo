package com.czy.base.error.api;

import com.czy.base.error.system.SystemProjectModule;
import com.google.common.base.Preconditions;

public interface ProjectModule {
    int getProjectCode();

    int getModuleCode();

    String getProjectName();

    String getModuleName();

    static void check(ProjectModule required, ProjectModule input) {
        Preconditions.checkNotNull(required);
        if (input != SystemProjectModule.INSTANCE) {
            Preconditions.checkState(required == input,
                    "module not match, need: " + required.getProjectName() + "-" + required.getModuleName()
                            + "(" + required.getProjectCode() + "-" + required.getModuleCode() + ")"
                            + " but input: " + input.getProjectName() + "-" + input.getModuleName()
                            + "(" + input.getProjectCode() + "-" + input.getModuleCode() + ")");
        }
    }
}
