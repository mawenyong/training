package com.ssm.trainingsystem.Dao;

import com.ssm.trainingsystem.Model.Loginperson;

public interface LoginpersonMapper {
    int deleteByPrimaryKey(Integer loginpersonid);

    int insert(Loginperson record);

    int insertSelective(Loginperson record);

    Loginperson selectByPrimaryKey(Integer loginpersonid);

    int updateByPrimaryKeySelective(Loginperson record);

    int updateByPrimaryKey(Loginperson record);
}