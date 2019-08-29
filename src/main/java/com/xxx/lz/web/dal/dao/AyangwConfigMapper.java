package com.xxx.lz.web.dal.dao;

import com.xxx.lz.web.dal.dataobj.AyangwConfig;
import com.xxx.lz.web.dal.dataobj.AyangwConfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AyangwConfigMapper {
    long countByExample(AyangwConfigExample example);

    int deleteByExample(AyangwConfigExample example);

    int deleteByPrimaryKey(String ayangwK);

    int insert(AyangwConfig record);

    int insertSelective(AyangwConfig record);

    List<AyangwConfig> selectByExampleWithBLOBs(AyangwConfigExample example);

    List<AyangwConfig> selectByExample(AyangwConfigExample example);

    AyangwConfig selectByPrimaryKey(String ayangwK);

    int updateByExampleSelective(@Param("record") AyangwConfig record, @Param("example") AyangwConfigExample example);

    int updateByExampleWithBLOBs(@Param("record") AyangwConfig record, @Param("example") AyangwConfigExample example);

    int updateByExample(@Param("record") AyangwConfig record, @Param("example") AyangwConfigExample example);

    int updateByPrimaryKeySelective(AyangwConfig record);

    int updateByPrimaryKeyWithBLOBs(AyangwConfig record);
}