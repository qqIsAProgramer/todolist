package homework.todolist.controller;

import homework.todolist.pojo.Todo;
import homework.todolist.utils.ResponseResult;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public class TodoController {

    /**
     * 创建待办事项
     * @param content 待办事项内容
     * @return
     */
    public ResponseResult<Todo> createTodo(String content) {
        return null;
    }

    /**
     * 修改待办事项内容
     * @param id 待办事项id
     * @param content 新待办事项内容
     * @return
     */
    public ResponseResult<Void> updateContent(Integer id, String content) {
        return null;
    }

    /**
     * 更新状态
     * @param id 待办事项id
     * @return
     * @apiNote 0代表未完成 1代表已完成
     */
    public ResponseResult<Void> updateStatus(Integer id) {
        return null;
    }

    /**
     * 为待办事项添加图片
     * @param id 待办事项id
     * @param picture 图片文件
     * @return 图片地址
     */
    public ResponseResult<String> addPicture(Integer id, MultipartFile picture) {
        return null;
    }

    /**
     * 获取所有的待办事项
     * @return
     */
    public ResponseResult<List<Todo>> getTodoList() {
        return null;
    }

    /**
     * 删除指定的待办事项
     * @param id 待办事项id
     * @return
     */
    public ResponseResult<Void> deleteTodo(Integer id) {
        return null;
    }
}
