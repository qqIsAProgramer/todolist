package com.homework.todolist.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @Author: qyl
 * @Date: 2020/11/10 11:25
 */
@Data
public class Todo {

    private Integer id;

    private String content;

    private Integer status;

    private Date createdAt;
}
