package com.dogofwar.nurse_helper.service.impl;

import com.dogofwar.model.BaseUser;
import com.dogofwar.model.NurseGroup;
import com.dogofwar.nurse_helper.dao.BaseUserDao;
import com.dogofwar.nurse_helper.dao.NurseGroupDao;
import com.dogofwar.nurse_helper.service.BaseUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Transactional
@Service("baseUserService")
public class BaseUserServiceImpl implements BaseUserService {

    @Autowired
    private BaseUserDao baseUserDao;
    @Autowired
    private NurseGroupDao nurseGroupDao;

    @Transactional(propagation= Propagation.REQUIRED,rollbackFor = Exception.class)
    @Override
    public List<BaseUser> getAllUser() {
        BaseUser user = new BaseUser();
        NurseGroup group = new NurseGroup();
        group.setId("11111111111");
        group.setCreateTime(new Date());
        group.setUpdateTime(new Date());
        group.setCreateUser("lbb");
        group.setUpdateUser("lbb");
        group.setGroupCode("0001");
        group.setGroupName("神外");
        nurseGroupDao.insert(group);
        System.out.print("1111111111111");
        baseUserDao.insert(user);
        List<BaseUser> allUser = baseUserDao.getAllUser();
        return allUser;
    }
    @Override
    public BaseUser addUser(Map<String, Object> params) {

        return null;
    }
}
