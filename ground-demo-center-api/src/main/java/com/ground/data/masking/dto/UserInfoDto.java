package com.ground.data.masking.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户信息
 */
@Data
public class UserInfoDto implements Serializable {
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
}
