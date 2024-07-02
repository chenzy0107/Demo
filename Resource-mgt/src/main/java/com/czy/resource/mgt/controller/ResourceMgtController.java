package com.czy.resource.mgt.controller;

import com.czy.commons.error.response.Result;
import com.czy.commons.remote.client.UserMgtClient;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/resource/")
public class ResourceMgtController {

    private final UserMgtClient userMgtClient;

    @GetMapping("/getUsername")
    public Result<String> getUsername() {
        return Result.success(userMgtClient.getUsername("001"));
    }

}
