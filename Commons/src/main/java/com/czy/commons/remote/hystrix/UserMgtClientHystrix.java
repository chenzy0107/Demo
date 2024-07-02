package com.czy.commons.remote.hystrix;

import com.czy.commons.remote.client.UserMgtClient;

public class UserMgtClientHystrix implements UserMgtClient {
    @Override
    public String getUsername(String userId) {
        return "请求超时了";
    }
}
