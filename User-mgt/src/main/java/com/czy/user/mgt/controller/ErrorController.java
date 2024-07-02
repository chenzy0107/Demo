package com.czy.user.mgt.controller;

import com.czy.commons.error.response.Result;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
@RequestMapping("/api/error")
public class ErrorController {

    @Value("${test.str}")
    private String str;

    @GetMapping("/get")
    public Result<String> get() {
        return Result.success(str);
    }

}
