package com.ssm.trainingsystem.Dao;

import com.ssm.trainingsystem.Model.Answer;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AnswerMapper {
    int deleteByPrimaryKey(Integer answerid);

    int insert(Answer record);

    int insertSelective(Answer record);

    Answer selectByPrimaryKey(Integer answerid);

    int updateByPrimaryKeySelective(Answer record);

    int updateByPrimaryKey(Answer record);

    List<Answer> selectAll(Answer answer);

    Answer selectOne(int answerid);
}