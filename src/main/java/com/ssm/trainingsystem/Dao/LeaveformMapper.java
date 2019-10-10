package com.ssm.trainingsystem.Dao;

import com.ssm.trainingsystem.Model.Leaveform;
import com.ssm.trainingsystem.Model.LeaveformExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface LeaveformMapper {
    int countByExample(LeaveformExample example);

    int deleteByExample(LeaveformExample example);

    int deleteByPrimaryKey(Integer leaveformid);

    int insert(Leaveform record);

    int insertSelective(Leaveform record);

    List<Leaveform> selectByExample(LeaveformExample example);

    Leaveform selectByPrimaryKey(Integer leaveformid);

    int updateByExampleSelective(@Param("record") Leaveform record, @Param("example") LeaveformExample example);

    int updateByExample(@Param("record") Leaveform record, @Param("example") LeaveformExample example);

    int updateByPrimaryKeySelective(Leaveform record);

    int updateByPrimaryKey(Leaveform record);
}