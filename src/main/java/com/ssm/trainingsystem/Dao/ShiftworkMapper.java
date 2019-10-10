package com.ssm.trainingsystem.Dao;

import com.ssm.trainingsystem.Model.Shiftwork;
import com.ssm.trainingsystem.Model.ShiftworkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShiftworkMapper {
    int countByExample(ShiftworkExample example);

    int deleteByExample(ShiftworkExample example);

    int deleteByPrimaryKey(Integer shiftworkid);

    int insert(Shiftwork record);

    int insertSelective(Shiftwork record);

    List<Shiftwork> selectByExample(ShiftworkExample example);

    Shiftwork selectByPrimaryKey(Integer shiftworkid);

    int updateByExampleSelective(@Param("record") Shiftwork record, @Param("example") ShiftworkExample example);

    int updateByExample(@Param("record") Shiftwork record, @Param("example") ShiftworkExample example);

    int updateByPrimaryKeySelective(Shiftwork record);

    int updateByPrimaryKey(Shiftwork record);
}