package com.ssm.trainingsystem.Dao;

import com.ssm.trainingsystem.Model.Numberclass;

public interface NumberclassMapper {
    int deleteByPrimaryKey(Integer numberclassid);

    int insert(Numberclass record);

    int insertSelective(Numberclass record);

    Numberclass selectByPrimaryKey(Integer numberclassid);

    int updateByPrimaryKeySelective(Numberclass record);

    int updateByPrimaryKey(Numberclass record);
}