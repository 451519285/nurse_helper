package com.dogofwar.nurse_helper.dao;

import com.dogofwar.model.BaseUser;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface BaseUserDao {
    int deleteByPrimaryKey(String id);

    int insert(BaseUser record);

    int insertSelective(BaseUser record);

    BaseUser selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(BaseUser record);

    int updateByPrimaryKey(BaseUser record);

    /**
     * 获取所有用户
     * @return
     */
    List<BaseUser> getAllUser();
}