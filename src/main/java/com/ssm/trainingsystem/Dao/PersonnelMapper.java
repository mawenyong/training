package com.ssm.trainingsystem.Dao;

import com.ssm.trainingsystem.Model.Personnel;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PersonnelMapper {
    int deleteByPrimaryKey(Integer personnelid);

    int insert(Personnel record);

    int insertSelective(Personnel record);

    Personnel selectByPrimaryKey(Integer personnelid);

    int updateByPrimaryKeySelective(Personnel record);

    int updateByPrimaryKey(Personnel record);
}