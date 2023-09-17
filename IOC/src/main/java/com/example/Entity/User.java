package com.example.ioc.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class User {
    private String Name;
    private Integer Age;
}
