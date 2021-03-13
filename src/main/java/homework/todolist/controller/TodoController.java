package homework.todolist.controller;

import homework.todolist.pojo.Todo;
import homework.todolist.utils.ResponseResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author:
 * @Date:
 */
@RestController
@RequestMapping("/todo")
public class TodoController {

    /**
     * 创建待办事项
     * @param content 待办事项内容
     * @return
     */
    @PostMapping("/create")
    public ResponseResult<Todo> createTodo(String content) {
        return null;
    }

    /**
     * 修改待办事项内容
     * @param id 待办事项id
     * @param content 新待办事项内容
     * @return
     */
    @PostMapping("/updateContent")
    public ResponseResult<Void> updateContent(Integer id, String content) {
        return null;
    }

    /**
     * 更新状态
     * @param id 待办事项id
     * @return
     * @apiNote 0代表未完成 1代表已完成
     */
    @PostMapping("/updateStatus")
    public ResponseResult<Void> updateStatus(Integer id) {
        return null;
    }

    /**
     * 获取所有的待办事项
     * @return
     */
    @GetMapping("/list")
    public ResponseResult<List<Todo>> getTodoList() {
        return null;
    }

    /**
     * 删除指定的待办事项
     * @param id 待办事项id
     * @return
     */
    @DeleteMapping("/delete")
    public ResponseResult<Void> deleteTodo(Integer id) {
        return null;
    }
}
