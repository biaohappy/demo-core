package com.xiaobiao.exception;

import com.xiaobiao.utils.CoreStringUtil;
import lombok.Getter;

/**
 * Created with IntelliJ IDEA.
 * User: LeonWong
 * Date: 2016-03-11
 * Time: 18:04
 * To change this template use File | Settings | File and Code Templates.
 */
public class CoreException extends RuntimeException {

    private static final long serialVersionUID = -176688951977431695L;
    @Getter
    private String code;

    public CoreException(String code) {
        this.code = code;
    }

    public CoreException(String code, Throwable throwable) {
        super(throwable);
        this.code = code;
    }

    public CoreException(String code, String message) {
        super(message);
        this.code = code;
    }

    public CoreException(String code, String message, Throwable throwable) {
        super(message, throwable);
        this.code = code;
    }

    public CoreException(String code, String message, String... arg) {
        super(CoreStringUtil.replaceString(message, arg));
        this.code = code;
    }

}
