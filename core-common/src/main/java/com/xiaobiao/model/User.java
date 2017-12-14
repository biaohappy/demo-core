package com.xiaobiao.model;

import com.xiaobiao.param.BaseParam;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Setter
@Getter
public class User extends BaseParam implements Serializable{

    private static final long serialVersionUID = -3226750040050425188L;

    private Integer id;

    private String usercode;

    private String username;

    private String password;

    private String salt;

    private String locked;

    private Date createTime;

}