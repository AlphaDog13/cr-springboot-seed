package com.cyberunner.seed.common.exception;

/**
 * Created by AlphaDog on 2018/8/5.
 */
public class ServiceException extends RuntimeException {
    public ServiceException() { }

    public ServiceException(String message) {
        super(message);
    }

    public ServiceException(String message, Throwable cause) {
        super(message, cause);
    }
}
