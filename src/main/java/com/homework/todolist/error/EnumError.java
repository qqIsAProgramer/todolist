package com.homework.todolist.error;

/**
 * @Author: qyl
 * @Date: 2020/11/10 11:42
 */
public enum EnumError {

    SUCCESS(1, "成功"),
    FAILED(0, "失败");

    private Integer errCode;
    private String errMsg;

    private EnumError(Integer errCode, String errMsg) {
        this.errCode = errCode;
        this.errMsg = errMsg;
    }

    public int getErrCode() {
        return this.errCode;
    }

    public String getErrMsg() {
        return this.errMsg;
    }
}
