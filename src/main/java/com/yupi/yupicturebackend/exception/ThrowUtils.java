package com.yupi.yupicturebackend.exception;

/**
 * 异常处理工具类
 */
public class ThrowUtils {

    /**
     * 条件成立则抛异常
     * @param condtion 条件
     * @param runtimeException 异常
     */
    public static void throwIf(boolean condtion,RuntimeException runtimeException){
        if(condtion){
            throw runtimeException;
        }
    }

    /**
     *  条件成立则抛异常
     * @param condtion 条件
     * @param errorCode 异常
     */
    public static void throwIf(boolean condtion,ErrorCode errorCode){
        throwIf(condtion,new BusinessException(errorCode));
    }

    /**
     *  条件成立则抛异常
     * @param condtion 条件
     * @param errorCode 异常
     * @param message 错误信息
     */
    public static void throwIf(boolean condtion,ErrorCode errorCode,String message){
        throwIf(condtion,new BusinessException(errorCode,message));
    }
}
