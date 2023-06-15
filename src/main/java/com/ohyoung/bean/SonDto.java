package com.ohyoung.bean;

import java.util.Objects;

/**
 * @author vince
 * @date 2023/6/15 11:36
 */
public class SonDto {

    private String name;

    private Integer age;

    private String created_by;

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

    public String getCreated_by() {
        return created_by;
    }

    public void setCreated_by(String created_by) {
        this.created_by = created_by;
    }

    @Override
    public String toString() {
        return "SonDto{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", created_by='" + created_by + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SonDto sonDto = (SonDto) o;
        return Objects.equals(name, sonDto.name) && Objects.equals(age, sonDto.age)  && Objects.equals(created_by, sonDto.created_by);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, created_by);
    }
}
