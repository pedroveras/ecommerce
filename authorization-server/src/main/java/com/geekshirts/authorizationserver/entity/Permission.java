package com.geekshirts.authorizationserver.entity;

import javax.persistence.Entity;

@Entity
public class Permission extends BaseEntity {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
