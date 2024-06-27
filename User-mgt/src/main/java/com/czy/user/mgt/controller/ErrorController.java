package com.czy.user.mgt.controller;

import com.czy.commons.error.manager.ErrorManager;
import com.czy.commons.error.manager.TreeNode;
import com.czy.commons.error.response.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/error")
public class ErrorController {

    @GetMapping("/get")
    public Result<List<TreeNode>> get(){
        return Result.success(ErrorManager.getAllErrorCodes());
    }

}
