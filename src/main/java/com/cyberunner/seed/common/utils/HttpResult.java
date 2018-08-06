package com.cyberunner.seed.common.utils;

import com.cyberunner.seed.common.model.Result;
import com.cyberunner.seed.common.model.ResultCode;

/**
 * Created by AlphaDog on 2018/8/5.
 */
public class HttpResult {

    private static final String DEFAULT_SUCCESS_MESSAGE = "成功";

    public static Result success() {
        return new Result()
                .setCode(ResultCode.SUCCESS)
                .setMessage(DEFAULT_SUCCESS_MESSAGE);
    }

    public static <T> Result<T> success(T data) {
        return new Result()
                .setCode(ResultCode.SUCCESS)
                .setMessage(DEFAULT_SUCCESS_MESSAGE)
                .setData(data);
    }

    public static Result fail(String message) {
        return new Result()
                .setCode(ResultCode.FAIL)
                .setMessage(message);
    }

}
