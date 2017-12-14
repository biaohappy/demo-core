package com.xiaobiao.enummoel;

import com.google.common.base.Objects;
import lombok.Getter;

/**
 * 异常枚举
 */
@Getter
public enum CoreErrorEnum {

    ERROR_CODE_341FFF("341FFF", "程序异常"),
    ERROR_CODE_341001("341001", "亲，您查询的信息不存在哦"),
    ERROR_CODE_341002("341002", "参数不能为空");


    private String errorCode;
    private String errorDesc;


    CoreErrorEnum(String errorCode, String errorDesc) {
        this.errorCode = errorCode;
        this.errorDesc = errorDesc;
    }

    public static String explain(String errorCode) {
        for (CoreErrorEnum coreErrorEnum : CoreErrorEnum.values()) {
            if (Objects.equal(errorCode, coreErrorEnum.errorCode)) {
                return coreErrorEnum.errorDesc;
            }
        }
        return errorCode;
    }
}
