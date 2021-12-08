package org.etekcity.cloud.errorcode;

import lombok.Data;

/**
 * @author KevinLiu
 */
public enum ErrorCode {
    COMMON_ILLEGAL_ARG_ERROR(-11000000, "illegal argument");

    private int code;
    private String msg;

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    private ErrorCode(int i, String s) {
    }
}
