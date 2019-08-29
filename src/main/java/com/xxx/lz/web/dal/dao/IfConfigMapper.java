package com.xxx.lz.web.dal.dao;

import com.xxx.lz.web.dal.dataobj.IfConfig;
import com.xxx.lz.web.dal.dataobj.IfConfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IfConfigMapper {
    long countByExample(IfConfigExample example);

    int deleteByExample(IfConfigExample example);

    int deleteByPrimaryKey(String ifK);

    int insert(IfConfig record);

    int insertSelective(IfConfig record);

    List<IfConfig> selectByExampleWithBLOBs(IfConfigExample example);

    List<IfConfig> selectByExample(IfConfigExample example);

    IfConfig selectByPrimaryKey(String ifK);

    int updateByExampleSelective(@Param("record") IfConfig record, @Param("example") IfConfigExample example);

    int updateByExampleWithBLOBs(@Param("record") IfConfig record, @Param("example") IfConfigExample example);

    int updateByExample(@Param("record") IfConfig record, @Param("example") IfConfigExample example);

    int updateByPrimaryKeySelective(IfConfig record);

    int updateByPrimaryKeyWithBLOBs(IfConfig record);
}