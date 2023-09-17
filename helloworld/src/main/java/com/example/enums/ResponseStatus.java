package com.example.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
//@AllArgsConstructor
public enum ResponseStatus {
    SUCCESS("200","success"),
    FAIL("500","failed"),
    HTTP_STATUS_200("200", "ok"),
    HTTP_STATUS_400("400", "request error"),
    HTTP_STATUS_401("401", "no authentication"),
    HTTP_STATUS_403("403", "no authorities"),
    HTTP_STATUS_500("500", "server error")
    ;
    ResponseStatus(String code,String desc){
        this.code=code;
        this.desc=desc;
    }
    private String code;
    private String desc;

}
