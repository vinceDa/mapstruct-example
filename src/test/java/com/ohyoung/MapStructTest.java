package com.ohyoung;

import com.ohyoung.bean.*;
import com.ohyoung.mapper.*;
import org.junit.Test;
import org.mapstruct.factory.Mappers;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author vince
 * @date 2023/6/15 11:45
 */
public class MapStructTest {

    /**
     * 基本转换
     */
    @Test
    public void baseMapper() {
        Mather mather = new Mather();
        mather.setName("mather");
        mather.setAge(18);
        mather.setCreateTime(LocalDateTime.now());
        MatherDto matherDto = BaseMapper.instance.toDto(mather);
        assert matherDto.getName().equals(mather.getName());
        assert matherDto.getAge().equals(mather.getAge());
        assert matherDto.getCreateTime().isEqual(mather.getCreateTime());

        Son son = new Son();
        son.setName("son");
        son.setAge(1);
        son.setCreatedBy("people");
        SonDto sonDto = BaseMapper.instance.toDto(son);
        assert sonDto.getName().equals(son.getName());
        assert sonDto.getAge().equals(son.getAge());
        assert sonDto.getCreated_by().equals(son.getCreatedBy());
    }

    /**
     * 对象嵌套对象
     */
    @Test
    public void nestedMapper() {
        Son son = new Son();
        son.setName("son");
        son.setAge(1);
        son.setCreatedBy("people");

        Father father = new Father();
        father.setName("father");
        father.setAge(18);
        father.setCreateTime(LocalDateTime.now());
        father.setSons(Collections.singletonList(son));

        FatherDto fatherDto = NestedMapper.instance.toDto(father);
        assert fatherDto.getName().equals(father.getName());
        assert fatherDto.getAge().equals(father.getAge());

        assert fatherDto.getSonDtos().get(0).getName().equals(father.getSons().get(0).getName());
        assert fatherDto.getSonDtos().get(0).getAge().equals(father.getSons().get(0).getAge());
        assert fatherDto.getSonDtos().get(0).getCreated_by().equals(father.getSons().get(0).getCreatedBy());

        // 使用default方法
        Son son1 = new Son();
        son1.setName("son1");
        son1.setAge(0);
        son1.setCreatedBy("people");
    }

    /**
     * 多对象合并为1个对象
     */
    @Test
    public void mergeMapper() {
        Father father = new Father();
        father.setName("father");

        Mather mather = new Mather();
        mather.setName("mather");

        Son son = new Son();
        son.setName("son");

        Family family = MergeMapper.instance.merge(father, mather, son);
        assert family.getFatherName().equals(father.getName());
        assert family.getMatherName().equals(mather.getName());
        assert family.getSonName().equals(son.getName());
    }

    /**
     * 使用表达式映射
     */
    @Test
    public void expressionMapper() {
        Father father = new Father();
        father.setCreateTime(LocalDateTime.now());

        FatherDto fatherDto = ExpressionMapper.instance.toDto(father);
        assert "father".equals(fatherDto.getName());
        assert fatherDto.getSonDtos() != null;

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        assert fatherDto.getCreate_time().equals(father.getCreateTime().format(formatter));
    }

    /**
     * 定义抽象方法实现映射
     */
    @Test
    public void abstractMapper() {
        Father father = new Father();
        father.setCreateTime(LocalDateTime.now());

        FatherDto fatherDto = Mappers.getMapper(AbstractMapper.class).toDto(father);
        assert "father_before".equals(fatherDto.getName());
        assert 999 == fatherDto.getAge();
    }


    /**
     * 使用自定义注解进行映射
     */
    @Test
    public void annotationMapper() {
        Son son = new Son();
        son.setName("son");
        son.setAge(1);
        son.setCreatedBy("people");
        SonDto sonDto = AnnotationMapper.instance.toDto(son);
        assert "0".equals(sonDto.getName());
        assert sonDto.getCreated_by().equals(son.getCreatedBy());
    }
}
