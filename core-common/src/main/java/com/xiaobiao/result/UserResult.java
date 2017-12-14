package com.xiaobiao.result;

import com.xiaobiao.param.BaseParam;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

@Setter
@Getter
@ToString
public class UserResult extends BaseParam implements Serializable{

    private static final long serialVersionUID = -404528855079489582L;

    private Integer id;

    private String usercode;

    private String username;

    private String password;

    private String salt;

    private String locked;

    private Date createTime;

}