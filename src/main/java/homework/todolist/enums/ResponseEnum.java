package homework.todolist.enums;

/**
 * @Author:
 * @Date:
 */
public enum ResponseEnum {
    SUCCESS(1, "成功"),
    FAIL(0, "失败"),
    ;

    /**
     * 状态码
     */
    private int code;

    /**
     * 状态信息
     */
    private String msg;

    ResponseEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
