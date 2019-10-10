package com.ssm.trainingsystem.Dao;

import com.ssm.trainingsystem.Model.Obtainemployment;
import com.ssm.trainingsystem.Model.ObtainemploymentExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface ObtainemploymentMapper {
    int countByExample(ObtainemploymentExample example);

    int deleteByExample(ObtainemploymentExample example);

    int deleteByPrimaryKey(Integer obtainemploymentid);

    int insert(Obtainemployment record);

    int insertSelective(Obtainemployment record);

    List<Obtainemployment> selectByExample(ObtainemploymentExample example);

    Obtainemployment selectByPrimaryKey(Integer obtainemploymentid);

    int updateByExampleSelective(@Param("record") Obtainemployment record, @Param("example") ObtainemploymentExample example);

    int updateByExample(@Param("record") Obtainemployment record, @Param("example") ObtainemploymentExample example);

    int updateByPrimaryKeySelective(Obtainemployment record);

    int updateByPrimaryKey(Obtainemployment record);
}