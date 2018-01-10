package com.dogofwar.nurse_helper.dao;

import com.dogofwar.model.NurseGroup;
import org.springframework.stereotype.Repository;

public interface NurseGroupDao {
    int deleteByPrimaryKey(String id);

    int insert(NurseGroup record);

    int insertSelective(NurseGroup record);

    NurseGroup selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(NurseGroup record);

    int updateByPrimaryKey(NurseGroup record);
}