package com.example.entity;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class User {
    private Integer userId;

    private String userName;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

}
