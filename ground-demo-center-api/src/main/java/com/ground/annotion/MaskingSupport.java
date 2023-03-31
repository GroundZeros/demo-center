package com.ground.annotion;

import java.lang.annotation.*;

/**
 * 数据脱敏启用
 */
@Retention(value = RetentionPolicy.RUNTIME)
@Target(value = {ElementType.METHOD, ElementType.TYPE})
@Documented
public @interface MaskingSupport {
}
