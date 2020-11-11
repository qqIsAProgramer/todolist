package com.homework.todolist.service;

import com.homework.todolist.pojo.Todo;
import com.homework.todolist.response.CommonResponse;

import java.util.List;

/**
 * @Author: qyl
 * @Date: 2020/11/10 21:11
 */
public interface TodoService {

    CommonResponse<Todo> createTodo(String content);

    CommonResponse updateContent(Integer id, String content);

    CommonResponse updateStatus(Integer id);

    CommonResponse<List<Todo>> listTodo();

    CommonResponse deleteTodo(Integer id);
}
