package com.ground.data.masking;

import com.ground.common.api.Response;
import com.ground.data.masking.dto.UserInfoDto;

/**
 * 用户信息读取服务
 */
public interface UserInfoReadService {

    Response<UserInfoDto> getUserInfo(String cardId);
}
