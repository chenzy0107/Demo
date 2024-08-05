package com.czy.user.mgt.service;

import java.time.LocalDate;

public interface UserInfoService {

    void register(String userName, Byte sex, LocalDate birthday);

}
