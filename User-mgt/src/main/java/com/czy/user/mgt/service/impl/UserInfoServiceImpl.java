package com.czy.user.mgt.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.czy.user.mgt.mapper.UserInfoMapper;
import com.czy.user.mgt.pojo.po.UserInfo;
import com.czy.user.mgt.service.UserInfoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Date;

@Service
@RequiredArgsConstructor
public class UserInfoServiceImpl implements UserInfoService {

    private final UserInfoMapper userInfoMapper;

    @Override
    public void register(String userName, Byte sex, LocalDate birthday) {
        UserInfo userInfo = UserInfo.builder()
                .userName(userName)
                .sex(sex)
                .birthday(birthday)
                .registerTime(new Date())
                .build();
        userInfoMapper.insert(userInfo);
    }
}
