package homework.todolist.utils;

import homework.todolist.enums.ResponseEnum;
import lombok.AllArgsConstructor;
import lombok.Data;

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

    /**
     * 返回成功结果（没有数据）
     * @param <T>
     * @return
     */
    public static <T> ResponseResult<T> ok() {
        return response(ResponseEnum.SUCCESS.getCode(), ResponseEnum.SUCCESS.getMsg(), null);
    }

    /**
     * 返回成功结果 + 数据
     * @param data
     * @param <T>
     * @return
     */
    public static <T> ResponseResult<T> ok(T data) {
        return response(ResponseEnum.SUCCESS.getCode(), ResponseEnum.SUCCESS.getMsg(), data);
    }

    /**
     * 返回失败结果（没有错误信息）
     * @param <T>
     * @return
     */
    public static <T> ResponseResult<T> fail() {
        return response(ResponseEnum.FAIL.getCode(), ResponseEnum.FAIL.getMsg(), null);
    }

    /**
     * 返回失败结果 + 错误码 + 错误信息
     * @param code
     * @param msg
     * @param <T>
     * @return
     */
    public static <T> ResponseResult<T> fail(int code, String msg) {
        return response(code, msg, null);
    }

    private static <T> ResponseResult<T> response(int code, String msg, T data) {
        return new ResponseResult<>(code, msg, data);
    }
}
