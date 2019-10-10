package com.ssm.trainingsystem.Dao;

import com.ssm.trainingsystem.Model.Leaveform;

public interface LeaveformMapper {
    int deleteByPrimaryKey(Integer leaveformid);

    int insert(Leaveform record);

    int insertSelective(Leaveform record);

    Leaveform selectByPrimaryKey(Integer leaveformid);

    int updateByPrimaryKeySelective(Leaveform record);

    int updateByPrimaryKey(Leaveform record);
}