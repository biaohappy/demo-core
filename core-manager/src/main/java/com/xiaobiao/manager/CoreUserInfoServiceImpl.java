package com.xiaobiao.manager;

import com.google.common.base.Throwables;
import com.xiaobiao.enummoel.CoreErrorEnum;
import com.xiaobiao.exception.CoreException;
import com.xiaobiao.param.UserParam;
import com.xiaobiao.result.UserResult;
import com.xiaobiao.service.InnerUserService;
import com.xiaobiao.utils.Response;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wuxiaobiao
 * @create 2017-12-08 16:02
 * To change this template use File | Settings | Editor | File and Code Templates.
 **/
@Service
@Slf4j
public class CoreUserInfoServiceImpl implements CoreUserInfoService {

    @Autowired
    private InnerUserService innerUserService;

    public Response<List<UserResult>> queryUserList(UserParam userParam) {
        log.info("call queryUserList, PARAMETER:{}", userParam);
        Response<List<UserResult>> result = new Response<List<UserResult>>();
        try {
            result.setResult(innerUserService.queryUserList(userParam));
            log.info("success to queryUserList,PARAMETER:{}, RESULT:{}", userParam, result);
            return result;
        } catch (CoreException ex) {
            result.setErrorCode(ex.getCode());
            result.setErrorMsg(ex.getMessage());
            log.info("failed to queryUserList,PARAMETER:{}, RESULT:{}", userParam, result);
            return result;
        } catch (Exception ex) {
            result.setErrorCode(CoreErrorEnum.ERROR_CODE_341FFF.getErrorCode());
            result.setErrorMsg(CoreErrorEnum.ERROR_CODE_341FFF.getErrorDesc());
            log.error("failed to queryUserList,PARAMETER:{}, CAUSE:{}", userParam, Throwables.getStackTraceAsString(ex));
            return result;
        }
    }

}
