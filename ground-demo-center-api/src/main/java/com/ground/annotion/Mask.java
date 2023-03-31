package com.ground.annotion;

import com.ground.enums.DataMaskingType;

import java.lang.annotation.*;

/**
 * 数据脱敏字段
 */
@Retention(value = RetentionPolicy.RUNTIME)
@Target(value = {ElementType.FIELD})
@Documented
public @interface Mask {

    /**
     * 字段类型
     */
    DataMaskingType type();
}
