package com.ssm.trainingsystem.Dao;

import com.ssm.trainingsystem.Model.Rolepersonnel;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RolepersonnelMapper {
    int deleteByPrimaryKey(Integer rolepersonnelid);

    int insert(Rolepersonnel record);

    int insertSelective(Rolepersonnel record);

    Rolepersonnel selectByPrimaryKey(Integer rolepersonnelid);

    int updateByPrimaryKeySelective(Rolepersonnel record);

    int updateByPrimaryKey(Rolepersonnel record);
}