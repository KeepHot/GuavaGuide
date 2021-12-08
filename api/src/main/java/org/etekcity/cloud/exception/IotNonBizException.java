package org.etekcity.cloud.exception;

import org.etekcity.cloud.errorcode.ErrorCode;

/**
 * @author KevinLiu
 */
public class IotNonBizException extends IotException {
    static final long serialVersionUID = -7033482187555766939L;

    public IotNonBizException() {
    }

    public IotNonBizException(ErrorCode errorCode) {
        super(errorCode);
    }

    public IotNonBizException(ErrorCode errorCode, String message) {
        super(errorCode, message);
    }

    public IotNonBizException(ErrorCode errorCode, Throwable cause) {
        super(errorCode, cause);
    }

    public IotNonBizException(ErrorCode errorCode, String message, Throwable cause) {
        super(errorCode, message, cause);
    }
}