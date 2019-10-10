package com.ssm.trainingsystem.Dao;

import com.ssm.trainingsystem.Model.Numberclass;
import com.ssm.trainingsystem.Model.NumberclassExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface NumberclassMapper {
    int countByExample(NumberclassExample example);

    int deleteByExample(NumberclassExample example);

    int deleteByPrimaryKey(Integer numberclassid);

    int insert(Numberclass record);

    int insertSelective(Numberclass record);

    List<Numberclass> selectByExample(NumberclassExample example);

    Numberclass selectByPrimaryKey(Integer numberclassid);

    int updateByExampleSelective(@Param("record") Numberclass record, @Param("example") NumberclassExample example);

    int updateByExample(@Param("record") Numberclass record, @Param("example") NumberclassExample example);

    int updateByPrimaryKeySelective(Numberclass record);

    int updateByPrimaryKey(Numberclass record);
}