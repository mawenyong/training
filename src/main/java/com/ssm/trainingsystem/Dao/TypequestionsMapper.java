package com.ssm.trainingsystem.Dao;

import com.ssm.trainingsystem.Model.Typequestions;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TypequestionsMapper {
    int deleteByPrimaryKey(Integer typequestionsid);

    int insert(Typequestions record);

    int insertSelective(Typequestions record);

    Typequestions selectByPrimaryKey(Integer typequestionsid);

    int updateByPrimaryKeySelective(Typequestions record);

    int updateByPrimaryKey(Typequestions record);
}