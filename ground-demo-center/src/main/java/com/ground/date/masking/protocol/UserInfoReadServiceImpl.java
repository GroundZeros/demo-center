package com.ground.date.masking.protocol;

import com.ground.common.api.Response;
import com.ground.data.masking.UserInfoReadService;
import com.ground.data.masking.dto.UserInfoDto;
import com.ground.date.masking.converter.UserInfoConverter;
import com.ground.date.masking.entry.UserInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class UserInfoReadServiceImpl implements UserInfoReadService {
    @Override
    public Response<UserInfoDto> getUserInfo(String cardId) {
        try {
            UserInfo userInfo = UserInfo.builder().address("浙江省杭州市西湖区鲤鱼山街鹏辉产业园1号楼政采云").name("开云").cardId("33010019970319456X")
                .email("dau735962199@163.com").build();
            UserInfoDto dto = UserInfoConverter.INSTANCE.toDto(userInfo);
            return Response.ok(dto);
        } catch (Exception e) {
            log.error("查询用户信息发生异常，cardId={}", cardId, e);
            return Response.fail("查询失败");
        }
    }
}
