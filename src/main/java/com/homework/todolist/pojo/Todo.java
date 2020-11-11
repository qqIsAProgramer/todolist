package com.homework.todolist.pojo;

import lombok.Data;

/**
 * @Author: qyl
 * @Date: 2020/11/10 11:25
 */
@Data
public class Todo {

    private Integer id;

    private String content;

    private Integer status;

    private String createdAt;
}
