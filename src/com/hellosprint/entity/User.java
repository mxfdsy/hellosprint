package com.hellosprint.entity;

import java.util.List;

/**
 * Created by 平凡的世界 on 2018/4/2.
 */
public class User {
    private String name;
    private int age;

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    private List<String> list;

    public User(){}

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
