package com.homework.todolist.controller;

import com.homework.todolist.pojo.Todo;
import com.homework.todolist.response.CommonResponse;
import com.homework.todolist.service.TodoService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: qyl
 * @Date: 2020/11/10 21:30
 */
@RestController
@RequestMapping("/todo")
public class TodoController {

    @Resource
    private TodoService todoService;

    @PostMapping("/create")
    public CommonResponse<Todo> createTodo(String content) {
        return todoService.createTodo(content);
    }

    @PostMapping("/updatecontent")
    public CommonResponse updateContent(Integer id, String content) {
        return todoService.updateContent(id, content);
    }

    @PostMapping("/updatestatus")
    public CommonResponse updateContent(Integer id) {
        return todoService.updateStatus(id);
    }

    @GetMapping("/list")
    public CommonResponse<List<Todo>> listTodo() {
        return todoService.listTodo();
    }

    @DeleteMapping("/delete")
    public CommonResponse<Todo> deleteTodo(Integer id) {
        return todoService.deleteTodo(id);
    }
}
