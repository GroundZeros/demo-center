package com.ground.enums;

import lombok.Getter;

import java.util.Objects;

/**
 * 脱敏字段类型
 */
@Getter
public enum DataMaskingType {
    NAME("姓名", 1),
    CARD_ID("身份证号", 2),
    EMAIL("邮箱", 3),
    MOBILE_PHONE("手机号", 4),
    ADDRESS("地址", 5);


    private String desc;

    private Integer code;

    DataMaskingType(String desc, Integer code) {
        this.desc = desc;
        this.code = code;
    }

    public static DataMaskingType from(Integer code) {
        if (Objects.isNull(code)) {
            return null;
        }
        for (DataMaskingType value : DataMaskingType.values()) {
            if (value.getCode().equals(code)) {
                return value;
            }
        }
        return null;
    }
}
