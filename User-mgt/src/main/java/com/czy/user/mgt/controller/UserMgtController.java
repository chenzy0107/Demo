package com.czy.user.mgt.controller;

import com.czy.commons.error.response.Result;
import com.czy.user.mgt.service.UserMgtService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/user")
public class UserMgtController {

    private final UserMgtService userMgtService;

    @GetMapping("/get")
    public Result<String> get(@RequestParam("userId") String userId) {
        return Result.success(userMgtService.getUsername(userId));
    }
}
