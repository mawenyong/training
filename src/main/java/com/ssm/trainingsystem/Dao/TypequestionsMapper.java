package com.ssm.trainingsystem.Dao;

import com.ssm.trainingsystem.Model.Typequestions;
import com.ssm.trainingsystem.Model.TypequestionsExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface TypequestionsMapper {
    int countByExample(TypequestionsExample example);

    int deleteByExample(TypequestionsExample example);

    int deleteByPrimaryKey(Integer typequestionsid);

    int insert(Typequestions record);

    int insertSelective(Typequestions record);

    List<Typequestions> selectByExample(TypequestionsExample example);

    Typequestions selectByPrimaryKey(Integer typequestionsid);

    int updateByExampleSelective(@Param("record") Typequestions record, @Param("example") TypequestionsExample example);

    int updateByExample(@Param("record") Typequestions record, @Param("example") TypequestionsExample example);

    int updateByPrimaryKeySelective(Typequestions record);

    int updateByPrimaryKey(Typequestions record);
}