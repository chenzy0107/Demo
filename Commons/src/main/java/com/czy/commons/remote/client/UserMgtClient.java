package com.czy.commons.remote.client;

import com.czy.commons.remote.config.OpenFeignResponseDecoder;
import com.czy.commons.remote.hystrix.UserMgtClientHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "user-mgt", path = "/api/user", fallback = UserMgtClientHystrix.class,
        configuration = OpenFeignResponseDecoder.class)
public interface UserMgtClient {

    @GetMapping(value = "/get")
    String getUsername(@RequestParam("userId") String userId);

}
