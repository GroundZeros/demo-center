package com.ground.data.masking.dto;

import com.ground.annotion.Mask;
import com.ground.enums.DataMaskingType;
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
    @Mask(type = DataMaskingType.NAME)
    private String name;
    /**
     * 身份证
     */
    @Mask(type = DataMaskingType.CARD_ID)
    private String cardId;
    /**
     * 住址
     */
    @Mask(type = DataMaskingType.ADDRESS)
    private String address;
    /**
     * 电子邮件
     */
    @Mask(type = DataMaskingType.EMAIL)
    private String email;
}
