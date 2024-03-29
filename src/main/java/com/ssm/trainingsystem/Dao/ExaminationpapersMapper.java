package com.ssm.trainingsystem.Dao;

import com.ssm.trainingsystem.Model.Examinationpapers;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ExaminationpapersMapper {
    int deleteByPrimaryKey(Integer examinationpapersid);

    int insert(Examinationpapers record);

    int insertSelective(Examinationpapers record);

    Examinationpapers selectByPrimaryKey(Integer examinationpapersid);

    int updateByPrimaryKeySelective(Examinationpapers record);

    int updateByPrimaryKey(Examinationpapers record);
}