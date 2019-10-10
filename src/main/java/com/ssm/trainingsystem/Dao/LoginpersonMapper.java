package com.ssm.trainingsystem.Dao;

import com.ssm.trainingsystem.Model.Loginperson;
import com.ssm.trainingsystem.Model.LoginpersonExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface LoginpersonMapper {
    int countByExample(LoginpersonExample example);

    int deleteByExample(LoginpersonExample example);

    int deleteByPrimaryKey(Integer loginpersonid);

    int insert(Loginperson record);

    int insertSelective(Loginperson record);

    List<Loginperson> selectByExample(LoginpersonExample example);

    Loginperson selectByPrimaryKey(Integer loginpersonid);

    int updateByExampleSelective(@Param("record") Loginperson record, @Param("example") LoginpersonExample example);

    int updateByExample(@Param("record") Loginperson record, @Param("example") LoginpersonExample example);

    int updateByPrimaryKeySelective(Loginperson record);

    int updateByPrimaryKey(Loginperson record);
}