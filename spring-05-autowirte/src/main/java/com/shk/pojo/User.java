package com.shk.pojo;

import org.springframework.beans.factory.annotation.Autowired;

public class User {
    private String name;
    @Autowired
private Dog dog;

    public Dog getDog() {
        return dog;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
