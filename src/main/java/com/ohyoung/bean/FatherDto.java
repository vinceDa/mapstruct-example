package com.ohyoung.bean;

import java.util.List;

/**
 * @author vince
 * @date 2023/6/15 11:36
 */
public class FatherDto {

    private String name;

    private Integer age;

    private List<SonDto> sonDtos;

    private String create_time;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    public List<SonDto> getSonDtos() {
        return sonDtos;
    }

    public void setSonDtos(List<SonDto> sonDtos) {
        this.sonDtos = sonDtos;
    }

    @Override
    public String toString() {
        return "FatherDto{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sonDtos=" + sonDtos +
                ", create_time='" + create_time + '\'' +
                '}';
    }
}
