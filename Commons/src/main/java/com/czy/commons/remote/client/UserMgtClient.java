package com.czy.commons.remote.client;

import com.czy.commons.remote.hystrix.UserMgtClientHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "user-mgt", path = "/api/user", fallback = UserMgtClientHystrix.class)
public interface UserMgtClient {

    @GetMapping(value = "/get", consumes = MediaType.MULTIPART_FORM_DATA_VALUE, produces = MediaType.MULTIPART_FORM_DATA_VALUE)
    String getUsername(@RequestParam("userId") String userId);
}
