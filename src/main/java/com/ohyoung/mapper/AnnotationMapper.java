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
public interface AnnotationMapper {

    AnnotationMapper instance = Mappers.getMapper(AnnotationMapper.class);

    /**
     * 使用注解对公共字段进行映射
     */
    @ToAnnotation
    SonDto toDto(Son son);

}
