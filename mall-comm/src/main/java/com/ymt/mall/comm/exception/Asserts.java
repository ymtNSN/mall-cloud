package com.ymt.mall.comm.exception;

import com.ymt.mall.comm.api.IErrorCode;

/**
 * 断言处理类，用于抛出各种API异常
 * Created by @author ymtNSN on 2020/4/24
 */
public class Asserts {

    public static void fail(String message) {
        throw new ApiException(message);
    }

    public static void fail(IErrorCode errorCode) {
        throw new ApiException(errorCode);
    }
}
