package homework.todolist.pojo;

import lombok.Data;

import java.util.Date;

/**
 * @Author:
 * @Date:
 */
@Data
public class Todo {

    /**
     * 待办事项id
     */
    private Integer id;

    /**
     * 待办事项内容
     */
    private String content;

    /**
     * 待办事项状态
     */
    private Integer status;

    /**
     * 待办事项的创建时间
     */
    private Date createTime;
}
