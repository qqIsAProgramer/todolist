package homework.todolist.utils;

import homework.todolist.enums.ResponseEnum;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Author:
 * @Date:
 */
@Data
@AllArgsConstructor
public class ResponseResult<T> {

    /**
     * 返回码
     */
    private int code;

    /**
     * 返回信息
     */
    private String msg;

    /**
     * 返回数据
     */
    private T data;

    public static <T> ResponseResult<T> ok() {
        return response(ResponseEnum.SUCCESS.getCode(), ResponseEnum.SUCCESS.getMsg(), null);
    }

    public static <T> ResponseResult<T> ok(T data) {
        return response(ResponseEnum.SUCCESS.getCode(), ResponseEnum.SUCCESS.getMsg(), data);
    }

    public static <T> ResponseResult<T> fail() {
        return response(ResponseEnum.FAIL.getCode(), ResponseEnum.FAIL.getMsg(), null);
    }

    public static <T> ResponseResult<T> fail(int code, String msg) {
        return response(code, msg, null);
    }

    private static <T> ResponseResult<T> response(int code, String msg, T data) {
        return new ResponseResult<>(code, msg, data);
    }
}
