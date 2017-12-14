package com.xiaobiao.manager;

import com.xiaobiao.param.UserParam;
import com.xiaobiao.result.UserResult;
import com.xiaobiao.utils.Response;

import java.util.List;

public interface CoreUserInfoService {

    /**
     * 查询用户资料
     *
     * @param userParam
     * @return
     */
    Response<List<UserResult>> queryUserList(UserParam userParam);

}
