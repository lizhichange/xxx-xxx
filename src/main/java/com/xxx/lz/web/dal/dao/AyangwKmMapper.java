package com.xxx.lz.web.dal.dao;

import com.xxx.lz.web.dal.dataobj.AyangwKm;
import com.xxx.lz.web.dal.dataobj.AyangwKmExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AyangwKmMapper {
    long countByExample(AyangwKmExample example);

    int deleteByExample(AyangwKmExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AyangwKm record);

    int insertSelective(AyangwKm record);

    List<AyangwKm> selectByExample(AyangwKmExample example);

    AyangwKm selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AyangwKm record, @Param("example") AyangwKmExample example);

    int updateByExample(@Param("record") AyangwKm record, @Param("example") AyangwKmExample example);

    int updateByPrimaryKeySelective(AyangwKm record);

    int updateByPrimaryKey(AyangwKm record);
}