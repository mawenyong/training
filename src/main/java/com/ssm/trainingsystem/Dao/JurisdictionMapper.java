package com.ssm.trainingsystem.Dao;

import com.ssm.trainingsystem.Model.Jurisdiction;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface JurisdictionMapper {
    int deleteByPrimaryKey(Integer jurisdictionid);

    int insert(Jurisdiction record);

    int insertSelective(Jurisdiction record);

    Jurisdiction selectByPrimaryKey(Integer jurisdictionid);

    int updateByPrimaryKeySelective(Jurisdiction record);

    int updateByPrimaryKey(Jurisdiction record);
}