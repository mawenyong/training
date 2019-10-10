package com.ssm.trainingsystem.Dao;

import com.ssm.trainingsystem.Model.Itembank;
import com.ssm.trainingsystem.Model.ItembankExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface ItembankMapper {
    int countByExample(ItembankExample example);

    int deleteByExample(ItembankExample example);

    int deleteByPrimaryKey(Integer itembankid);

    int insert(Itembank record);

    int insertSelective(Itembank record);

    List<Itembank> selectByExample(ItembankExample example);

    Itembank selectByPrimaryKey(Integer itembankid);

    int updateByExampleSelective(@Param("record") Itembank record, @Param("example") ItembankExample example);

    int updateByExample(@Param("record") Itembank record, @Param("example") ItembankExample example);

    int updateByPrimaryKeySelective(Itembank record);

    int updateByPrimaryKey(Itembank record);
}