package com.ssm.trainingsystem.Dao;

import com.ssm.trainingsystem.Model.Answerspaper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AnswerspaperMapper {
    int deleteByPrimaryKey(Integer answerspaperid);

    int insert(Answerspaper record);

    int insertSelective(Answerspaper record);

    Answerspaper selectByPrimaryKey(Integer answerspaperid);

    int updateByPrimaryKeySelective(Answerspaper record);

    int updateByPrimaryKey(Answerspaper record);
}