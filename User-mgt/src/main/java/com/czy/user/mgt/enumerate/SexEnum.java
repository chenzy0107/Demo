package com.czy.user.mgt.enumerate;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;
import java.util.Objects;

@Getter
@AllArgsConstructor
public enum SexEnum {
    MALE((byte) 0, "男"),
    FEMALE((byte) 1, "女");

    private Byte sex;
    private String desc;

    public static SexEnum valueOf(Byte sex) {
        if (null == sex) {
            return null;
        }
        return Arrays.stream(values()).filter(s -> Objects.equals(s.getSex(), sex))
                .findFirst().orElse(null);
    }
}
