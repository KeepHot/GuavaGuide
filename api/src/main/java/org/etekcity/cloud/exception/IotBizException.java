package org.etekcity.cloud.exception;

import org.etekcity.cloud.errorcode.ErrorCode;

/**
 * @author KevinLiu
 */
public class IotBizException extends IotException {
    static final long serialVersionUID = -70334813241346939L;

    public IotBizException() {
    }

    public IotBizException(ErrorCode errorCode) {
        super(errorCode);
    }

    public IotBizException(ErrorCode errorCode, String message) {
        super(errorCode, message);
    }

    public IotBizException(ErrorCode errorCode, Throwable cause) {
        super(errorCode, cause);
    }

    public IotBizException(ErrorCode errorCode, String message, Throwable cause) {
        super(errorCode, message, cause);
    }
}
