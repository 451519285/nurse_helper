package com.dogofwar.nurse_helper.service;

import com.dogofwar.model.BaseUser;

import java.util.List;
import java.util.Map;

public interface BaseUserService {

    /**
     * 新增用户
     * @param params
     * @return
     */
    BaseUser addUser(Map<String, Object> params);

    /**
     * 获取所有用户
     * @return
     */
    List<BaseUser> getAllUser();
}