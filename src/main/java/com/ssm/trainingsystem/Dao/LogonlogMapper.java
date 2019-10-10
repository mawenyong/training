package com.ssm.trainingsystem.Dao;

import com.ssm.trainingsystem.Model.Logonlog;

public interface LogonlogMapper {
    int deleteByPrimaryKey(Integer logid);

    int insert(Logonlog record);

    int insertSelective(Logonlog record);

    Logonlog selectByPrimaryKey(Integer logid);

    int updateByPrimaryKeySelective(Logonlog record);

    int updateByPrimaryKey(Logonlog record);
}