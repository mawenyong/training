package com.ssm.trainingsystem.Dao;

import com.ssm.trainingsystem.Model.Loginperson;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface LoginpersonMapper {
    int deleteByPrimaryKey(Integer loginpersonid);

    int insert(Loginperson record);

    int insertSelective(Loginperson record);

    Loginperson selectByPrimaryKey(Integer loginpersonid);

    int updateByPrimaryKeySelective(Loginperson record);

    int updateByPrimaryKey(Loginperson record);

    Loginperson isLog(Loginperson loginperson);

    int selectLoginPersonName(String loginname);

    List<Loginperson> selectAll(Loginperson loginperson);
}