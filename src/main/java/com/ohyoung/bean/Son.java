package com.ohyoung.bean;

/**
 * @author vince
 * @date 2023/6/15 11:36
 */
public class Son {

    private String name;

    private Integer age;

    private String createdBy;

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

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    @Override
    public String toString() {
        return "Father{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", createdBy=" + createdBy +
                '}';
    }
}
