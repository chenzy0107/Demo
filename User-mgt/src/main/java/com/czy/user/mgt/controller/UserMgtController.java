package com.czy.user.mgt.controller;

import com.czy.commons.error.response.Result;
import com.czy.user.mgt.service.UserInfoService;
import lombok.RequiredArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/user")
public class UserMgtController {

    private final UserInfoService userInfoService;

    @GetMapping("/register")
    public Result<?> registerUser(@RequestParam("userName") String userName,
                                  @RequestParam("sex") Byte sex,
                                 @DateTimeFormat(pattern = "yyyy-MM-dd") @RequestParam("birthday") LocalDate birthday) {

        userInfoService.register(userName, sex, birthday);
        return Result.success();
    }
}
