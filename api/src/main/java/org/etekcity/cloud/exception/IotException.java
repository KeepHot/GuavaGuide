package org.etekcity.cloud.exception;

import java.io.Serializable;

import org.etekcity.cloud.errorcode.ErrorCode;


/**
 * @author KevinLiu
 */
public class IotException extends RuntimeException {

    private static final long serialVersionUID = 3873782183212182911L;

    private final ErrorCode errorCode;

    public IotException() {
        this.errorCode = ErrorCode.COMMON_ILLEGAL_ARG_ERROR;
    }

    public IotException(ErrorCode errorCode) {
        super(errorCode.getMsg());
        this.errorCode = errorCode;
    }

    public IotException(ErrorCode errorCode, String message) {
        super(message);
        this.errorCode = errorCode;
    }

    public IotException(ErrorCode errorCode, Throwable cause) {
        super(errorCode.getMsg(), cause);
        this.errorCode = errorCode;
    }

    public IotException(ErrorCode errorCode, String message, Throwable cause) {
        super(message, cause);
        this.errorCode = errorCode;
    }

    public ErrorCode getErrorCode() {
        return this.errorCode;
    }
}
