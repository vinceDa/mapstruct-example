package com.ohyoung.mapper;

import com.ohyoung.bean.*;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

/**
 * 将几个对象合并为一个
 * @author vince
 * @date 2023/6/15 11:53
 */
@Mapper
public interface MergeMapper {

    MergeMapper instance = Mappers.getMapper(MergeMapper.class);

    @Mapping(target = "fatherName", source = "father.name")
    @Mapping(target = "matherName", source = "mather.name")
    @Mapping(target = "sonName", source = "son.name")
    Family merge(Father father, Mather mather, Son son);
}
