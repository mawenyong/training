package com.ssm.trainingsystem.Dao;

import com.ssm.trainingsystem.Model.Rolepersonnel;
import com.ssm.trainingsystem.Model.RolepersonnelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RolepersonnelMapper {
    int countByExample(RolepersonnelExample example);

    int deleteByExample(RolepersonnelExample example);

    int deleteByPrimaryKey(Integer rolepersonnelid);

    int insert(Rolepersonnel record);

    int insertSelective(Rolepersonnel record);

    List<Rolepersonnel> selectByExample(RolepersonnelExample example);

    Rolepersonnel selectByPrimaryKey(Integer rolepersonnelid);

    int updateByExampleSelective(@Param("record") Rolepersonnel record, @Param("example") RolepersonnelExample example);

    int updateByExample(@Param("record") Rolepersonnel record, @Param("example") RolepersonnelExample example);

    int updateByPrimaryKeySelective(Rolepersonnel record);

    int updateByPrimaryKey(Rolepersonnel record);
}