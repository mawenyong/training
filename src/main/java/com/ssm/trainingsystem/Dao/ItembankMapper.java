package com.ssm.trainingsystem.Dao;

import com.ssm.trainingsystem.Model.Itembank;

public interface ItembankMapper {
    int deleteByPrimaryKey(Integer itembankid);

    int insert(Itembank record);

    int insertSelective(Itembank record);

    Itembank selectByPrimaryKey(Integer itembankid);

    int updateByPrimaryKeySelective(Itembank record);

    int updateByPrimaryKey(Itembank record);
}