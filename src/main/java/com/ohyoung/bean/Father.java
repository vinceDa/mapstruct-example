package com.ohyoung.bean;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @author vince
 * @date 2023/6/15 11:36
 */
public class Father {

    private String name;

    private Integer age;

    private List<Son> sons;

    private LocalDateTime createTime;

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

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public List<Son> getSons() {
        return sons;
    }

    public void setSons(List<Son> sons) {
        this.sons = sons;
    }

    @Override
    public String toString() {
        return "Father{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sons=" + sons +
                ", createTime=" + createTime +
                '}';
    }
}
