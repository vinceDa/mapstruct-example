package com.ohyoung.mapper;

import com.ohyoung.bean.Father;
import com.ohyoung.bean.FatherDto;
import com.ohyoung.bean.Son;
import com.ohyoung.bean.SonDto;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

import java.util.Collection;
import java.util.List;

/**
 * 定义抽象类, 前置、后置处理进行映射
 * @author vince
 * @date 2023/6/15 11:53
 */
@Mapper
public abstract class AbstractMapper {

    /**
     * 前置处理
     */
    @BeforeMapping
    protected void setCusName(Father father) {
        father.setName("father_before");
    }

    /**
     * 后置处理
     */
    @AfterMapping
    protected void setCusAge(@MappingTarget FatherDto fatherDto) {
        fatherDto.setAge(999);
    }

    public abstract FatherDto toDto(Father father);
}
