package com.ohyoung.mapper;

import com.ohyoung.bean.*;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * 基础映射
 * @author vince
 * @date 2023/6/15 11:53
 */
@Mapper
public interface BaseMapper {

    BaseMapper instance = Mappers.getMapper(BaseMapper.class);

    /**
     * 相同字段名默认转换, 不需要添加额外注解
     */
    MatherDto toDto(Mather mather);


    /**
     * 不同字段名需要添加@Mapping注解
     */
    @Mapping(target = "created_by", source = "createdBy")
    SonDto toDto(Son son);

    /**
     * 集合映射会自动找到已存在的映射方法
     */
    List<SonDto> toDto(List<Son> sons);
}
