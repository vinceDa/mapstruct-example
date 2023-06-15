package com.ohyoung.bean;

import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author vince
 * @date 2023/6/15 15:10
 */
@Retention(RetentionPolicy.CLASS)
@Mappings({
        @Mapping(target = "name", constant = "0"),
        @Mapping(target = "created_by", source = "createdBy")
})
public @interface ToAnnotation {
}
