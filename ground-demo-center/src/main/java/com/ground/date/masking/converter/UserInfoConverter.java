package com.ground.date.masking.converter;

import com.ground.data.masking.dto.UserInfoDto;
import com.ground.date.masking.entry.UserInfo;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserInfoConverter {

    UserInfoConverter INSTANCE = Mappers.getMapper(UserInfoConverter.class);

    UserInfoDto toDto(UserInfo domain);
}
