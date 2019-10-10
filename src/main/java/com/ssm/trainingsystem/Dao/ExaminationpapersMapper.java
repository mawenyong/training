package com.ssm.trainingsystem.Dao;

import com.ssm.trainingsystem.Model.Examinationpapers;
import com.ssm.trainingsystem.Model.ExaminationpapersExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface ExaminationpapersMapper {
    int countByExample(ExaminationpapersExample example);

    int deleteByExample(ExaminationpapersExample example);

    int deleteByPrimaryKey(Integer examinationpapersid);

    int insert(Examinationpapers record);

    int insertSelective(Examinationpapers record);

    List<Examinationpapers> selectByExample(ExaminationpapersExample example);

    Examinationpapers selectByPrimaryKey(Integer examinationpapersid);

    int updateByExampleSelective(@Param("record") Examinationpapers record, @Param("example") ExaminationpapersExample example);

    int updateByExample(@Param("record") Examinationpapers record, @Param("example") ExaminationpapersExample example);

    int updateByPrimaryKeySelective(Examinationpapers record);

    int updateByPrimaryKey(Examinationpapers record);
}