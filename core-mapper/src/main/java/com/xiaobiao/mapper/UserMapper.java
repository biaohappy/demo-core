package com.xiaobiao.mapper;

import com.xiaobiao.model.User;

import java.util.List;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insertSelective(User record);

    User selectUserInfo(Integer id);

    int updateByPrimaryKeySelective(User record);

    List<User> selectUserList(User record);
}