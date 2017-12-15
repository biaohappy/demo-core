package com.xiaobiao.manager;

import com.xiaobiao.base.BaseManagerSpringTest;
import com.xiaobiao.param.UserParam;
import com.xiaobiao.result.UserResult;
import com.xiaobiao.utils.Response;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author wuxiaobiao
 * @create 2017-12-08 16:59
 * To change this template use File | Settings | Editor | File and Code Templates.
 **/
public class UserTest extends BaseManagerSpringTest {

    @Autowired
    private CoreUserInfoService coreUserInfoService;

    @Test
    public void queryUserList() {
        UserParam param = new UserParam();
        param.setUsercode("1");
        Response<List<UserResult>> actual = coreUserInfoService.queryUserList(param);

        if (!actual.isSuccess()) {
            logger.info("失败时，错误代码：" + actual.getErrorCode() + "，错误原因：" + actual.getErrorMsg());
        }
        Assert.assertEquals(true, actual.isSuccess());
        logger.info("成功" + actual.getResult());
    }

}
