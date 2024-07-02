package com.czy.user.mgt.service;

import com.czy.commons.remote.client.UserMgtClient;
import org.springframework.stereotype.Service;

@Service
public class UserMgtService implements UserMgtClient {
    @Override
    public String getUsername(String userId) {
        if (null == userId) {
            return null;
        }
        String username;
        switch (userId) {
            case "001":
                username = "czy001";
                break;
            case "002":
                username = "czy002";
                break;
            case "003":
                username = "czy003";
                break;
            default:
                username = "未知";
        }
        return username;
    }
}
