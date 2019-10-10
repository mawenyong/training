package com.ssm.trainingsystem.Dao;

import com.ssm.trainingsystem.Model.Shiftwork;

public interface ShiftworkMapper {
    int deleteByPrimaryKey(Integer shiftworkid);

    int insert(Shiftwork record);

    int insertSelective(Shiftwork record);

    Shiftwork selectByPrimaryKey(Integer shiftworkid);

    int updateByPrimaryKeySelective(Shiftwork record);

    int updateByPrimaryKey(Shiftwork record);
}