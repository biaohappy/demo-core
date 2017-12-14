package com.xiaobiao.service;

import com.xiaobiao.enummoel.CoreErrorEnum;
import com.xiaobiao.exception.CoreException;
import com.xiaobiao.mapper.UserMapper;
import com.xiaobiao.model.User;
import com.xiaobiao.param.UserParam;
import com.xiaobiao.result.UserResult;
import com.xiaobiao.utils.BeanMapper;
import com.xiaobiao.utils.ObjectUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author wuxiaobiao
 * @create 2017-12-08 15:30
 * To change this template use File | Settings | Editor | File and Code Templates.
 **/
@Component
public class InnerUserService {

    @Autowired
    private UserMapper userMapper;

    @Transactional(readOnly = true, isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public List<UserResult> queryUserList(UserParam userParam) {
        User user = new User();
        BeanMapper.copy(userParam, user);
        List<User> list = userMapper.selectUserList(user);
        if ((ObjectUtils.isNullOrEmpty(list)) && userParam.getIsNullError()){
            throw new CoreException(CoreErrorEnum.ERROR_CODE_341001.getErrorCode(),
                    CoreErrorEnum.ERROR_CODE_341001.getErrorDesc());
        }
        return BeanMapper.mapList(list, UserResult.class);
    }

}
