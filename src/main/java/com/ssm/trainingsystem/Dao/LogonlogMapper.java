package com.ssm.trainingsystem.Dao;

import com.ssm.trainingsystem.Model.Logonlog;
import com.ssm.trainingsystem.Model.LogonlogExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface LogonlogMapper {
    int countByExample(LogonlogExample example);

    int deleteByExample(LogonlogExample example);

    int deleteByPrimaryKey(Integer logid);

    int insert(Logonlog record);

    int insertSelective(Logonlog record);

    List<Logonlog> selectByExample(LogonlogExample example);

    Logonlog selectByPrimaryKey(Integer logid);

    int updateByExampleSelective(@Param("record") Logonlog record, @Param("example") LogonlogExample example);

    int updateByExample(@Param("record") Logonlog record, @Param("example") LogonlogExample example);

    int updateByPrimaryKeySelective(Logonlog record);

    int updateByPrimaryKey(Logonlog record);
}