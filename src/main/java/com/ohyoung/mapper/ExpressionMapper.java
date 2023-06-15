package com.ohyoung.mapper;

import com.ohyoung.bean.Father;
import com.ohyoung.bean.FatherDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

/**
 * 直接使用表达式或常量进行映射
 * @author vince
 * @date 2023/6/15 11:53
 */
@Mapper(uses = {BaseMapper.class})
public interface ExpressionMapper {

    ExpressionMapper instance = Mappers.getMapper(ExpressionMapper.class);

    /**
     * constant: 常量
     * expression: java表达式
     * dateFormat内置的表达式
     */
    @Mapping(target = "name", constant = "father")
    @Mapping(target = "sonDtos", expression = "java(father.getSons() == null ? new java.util.ArrayList<>() : BaseMapper.instance.toDto(father.getSons()))")
    @Mapping(target="create_time", source = "createTime", dateFormat = "yyyy-MM-dd HH:mm:ss")
    FatherDto toDto(Father father);
}
