package com.ssm.trainingsystem.Dao;

import com.ssm.trainingsystem.Model.Answerspaper;
import com.ssm.trainingsystem.Model.AnswerspaperExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface AnswerspaperMapper {
    int countByExample(AnswerspaperExample example);

    int deleteByExample(AnswerspaperExample example);

    int deleteByPrimaryKey(Integer answerspaperid);

    int insert(Answerspaper record);

    int insertSelective(Answerspaper record);

    List<Answerspaper> selectByExample(AnswerspaperExample example);

    Answerspaper selectByPrimaryKey(Integer answerspaperid);

    int updateByExampleSelective(@Param("record") Answerspaper record, @Param("example") AnswerspaperExample example);

    int updateByExample(@Param("record") Answerspaper record, @Param("example") AnswerspaperExample example);

    int updateByPrimaryKeySelective(Answerspaper record);

    int updateByPrimaryKey(Answerspaper record);
}