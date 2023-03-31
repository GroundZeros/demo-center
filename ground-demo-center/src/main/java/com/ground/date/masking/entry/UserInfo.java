package com.ground.date.masking.entry;

import lombok.Builder;
import lombok.Getter;

/**
 * 用户信息
 */
@Getter
public class UserInfo {
    /**
     * 姓名
     */
    private String name;
    /**
     * 身份证
     */
    private String cardId;
    /**
     * 住址
     */
    private String address;
    /**
     * 电子邮件
     */
    private String email;

    @Builder
    public UserInfo(String name, String cardId, String address, String email) {
        this.name = name;
        this.cardId = cardId;
        this.address = address;
        this.email = email;
    }
}
