package com.xiaobiao.param;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Setter
@Getter
public class UserParam extends BaseParam implements Serializable{

    private static final long serialVersionUID = -3047883025617159952L;

    private Integer id;

    private String usercode;

    private String username;

    private String password;

    private String salt;

    private String locked;

    private Date createTime;

}