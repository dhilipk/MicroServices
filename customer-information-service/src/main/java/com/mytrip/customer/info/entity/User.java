package com.mytrip.customer.info.entity;

import org.springframework.data.annotation.Id;

import lombok.Data;

@Data
public class User {

    static final long serialVersionUID = 1L;

    @Id
    private String id;

    private String username;
    private String password;
    private boolean enabled;

}