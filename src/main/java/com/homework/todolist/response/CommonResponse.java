package com.homework.todolist.response;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Author: qyl
 * @Date: 2020/11/10 11:33
 */
@Data
@AllArgsConstructor
public class CommonResponse<T> {

    private Integer code;

    private String message;
    
    private T data;
    
    public CommonResponse(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
