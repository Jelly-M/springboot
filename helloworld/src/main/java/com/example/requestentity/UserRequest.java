package com.example.requestentity;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class UserRequest {
   @NotEmpty(message = "id不能为空")
    private Integer id;
    private String userNmae;
    private String userAge;
}
