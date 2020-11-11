package com.homework.todolist.service.impl;

import com.homework.todolist.error.EnumError;
import com.homework.todolist.mapper.TodoMapper;
import com.homework.todolist.pojo.Todo;
import com.homework.todolist.response.CommonResponse;
import com.homework.todolist.service.TodoService;
import com.homework.todolist.utils.TimeUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * @Author: qyl
 * @Date: 2020/11/10 21:18
 */
@Service
public class TodoServiceImpl implements TodoService {

    @Resource
    private TodoMapper todoMapper;
    @Resource
    private TimeUtil timeUtil;

    @Override
    public CommonResponse<Todo> createTodo(String content) {
        Todo todo = new Todo();
        todo.setContent(content);
        todo.setCreatedAt(timeUtil.timeFormat(new Date()));
        todo.setStatus(0);

        int affectedRow = todoMapper.createTodo(todo);
        if (affectedRow > 0) {
            return new CommonResponse<>(EnumError.SUCCESS.getErrCode(), EnumError.SUCCESS.getErrMsg(), todo);
        }

        return new CommonResponse<>(EnumError.FAILED.getErrCode(), EnumError.FAILED.getErrMsg());
    }

    @Override
    public CommonResponse updateContent(Integer id, String content) {
        int affectedRow = todoMapper.updateContent(id, content);
        if (affectedRow > 0) {
            return new CommonResponse(EnumError.SUCCESS.getErrCode(), EnumError.SUCCESS.getErrMsg());
        }
        return new CommonResponse(EnumError.FAILED.getErrCode(), EnumError.FAILED.getErrMsg());
    }

    @Override
    public CommonResponse updateStatus(Integer id) {
        Todo todo = todoMapper.getTodoById(id);
        int affectedRow = todoMapper.updateStatus(id, todo.getStatus() == 0 ? 1 : 0);
        if (affectedRow > 0) {
            return new CommonResponse(EnumError.SUCCESS.getErrCode(), EnumError.SUCCESS.getErrMsg());
        }
        return new CommonResponse(EnumError.FAILED.getErrCode(), EnumError.FAILED.getErrMsg());
    }

    @Override
    public CommonResponse<List<Todo>> listTodo() {
        List<Todo> todos = todoMapper.listTodo();
        if (todos == null) {
            return new CommonResponse(EnumError.FAILED.getErrCode(), EnumError.FAILED.getErrMsg());
        }
        return new CommonResponse(EnumError.SUCCESS.getErrCode(), EnumError.SUCCESS.getErrMsg(), todos);
    }

    @Override
    public CommonResponse deleteTodo(Integer id) {
        int affectedRow = todoMapper.deleteTodo(id);
        if (affectedRow > 0) {
            return new CommonResponse(EnumError.SUCCESS.getErrCode(), EnumError.SUCCESS.getErrMsg());
        }
        return new CommonResponse(EnumError.FAILED.getErrCode(), EnumError.FAILED.getErrMsg());
    }
}
