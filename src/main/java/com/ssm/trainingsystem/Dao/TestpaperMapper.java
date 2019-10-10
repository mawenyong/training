package com.ssm.trainingsystem.Dao;

import com.ssm.trainingsystem.Model.Testpaper;

public interface TestpaperMapper {
    int deleteByPrimaryKey(Integer testpaperid);

    int insert(Testpaper record);

    int insertSelective(Testpaper record);

    Testpaper selectByPrimaryKey(Integer testpaperid);

    int updateByPrimaryKeySelective(Testpaper record);

    int updateByPrimaryKey(Testpaper record);
}