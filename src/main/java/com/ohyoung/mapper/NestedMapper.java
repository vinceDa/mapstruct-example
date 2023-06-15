package com.ohyoung.mapper;

import com.ohyoung.bean.*;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.time.LocalDateTime;

/**
 * 对象嵌套对象的映射
 * @author vince
 * @date 2023/6/15 11:53
 */
@Mapper(uses = {BaseMapper.class})
public interface NestedMapper {

    NestedMapper instance = Mappers.getMapper(NestedMapper.class);

    /**
     * 这里可以引用BaseMapper中已存在的映射方法, 也可以直接把BaseMapper中的方法复制过来
     * 像这样:
     *     @Mapping(target = "created_by", source = "createdBy")
     *     SonDto toDto(Son son);
     * 或者通过default方法直接实现:
     *    default SonDto toDto(Son son) {
     *       ....
     *    }
     *
     */
    @Mapping(target = "sonDtos", source = "sons")
    FatherDto toDto(Father father);

}
