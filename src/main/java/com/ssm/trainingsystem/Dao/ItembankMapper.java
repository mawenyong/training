package com.ssm.trainingsystem.Dao;

import com.ssm.trainingsystem.Model.Itembank;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ItembankMapper {
    int deleteByPrimaryKey(Integer itembankid);

    int insert(Itembank record);

    int insertSelective(Itembank record);

    Itembank selectByPrimaryKey(Integer itembankid);

    int updateByPrimaryKeySelective(Itembank record);

    int updateByPrimaryKey(Itembank record);
}