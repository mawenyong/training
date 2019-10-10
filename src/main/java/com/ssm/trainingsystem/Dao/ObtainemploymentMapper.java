package com.ssm.trainingsystem.Dao;

import com.ssm.trainingsystem.Model.Obtainemployment;

public interface ObtainemploymentMapper {
    int deleteByPrimaryKey(Integer obtainemploymentid);

    int insert(Obtainemployment record);

    int insertSelective(Obtainemployment record);

    Obtainemployment selectByPrimaryKey(Integer obtainemploymentid);

    int updateByPrimaryKeySelective(Obtainemployment record);

    int updateByPrimaryKey(Obtainemployment record);
}