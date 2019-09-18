package com.xxx.lz.web.dal.dao;

import com.xxx.lz.web.dal.dataobj.AyangwType;
import com.xxx.lz.web.dal.dataobj.AyangwTypeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AyangwTypeMapper {
    long countByExample(AyangwTypeExample example);

    int deleteByExample(AyangwTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AyangwType record);

    int insertSelective(AyangwType record);

    List<AyangwType> selectByExample(AyangwTypeExample example);

    AyangwType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AyangwType record, @Param("example") AyangwTypeExample example);

    int updateByExample(@Param("record") AyangwType record, @Param("example") AyangwTypeExample example);

    int updateByPrimaryKeySelective(AyangwType record);

    int updateByPrimaryKey(AyangwType record);
}