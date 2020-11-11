package com.homework.todolist.mapper;

import com.homework.todolist.pojo.Todo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author: qyl
 * @Date: 2020/11/10 11:29
 */
@Mapper
public interface TodoMapper {

    int createTodo(Todo todo);

    List<Todo> listTodo();

    int updateStatus(Integer id, Integer status);

    int updateContent(Integer id, String content);

    int deleteTodo(Integer id);

    Todo getTodoById(Integer id);
}
