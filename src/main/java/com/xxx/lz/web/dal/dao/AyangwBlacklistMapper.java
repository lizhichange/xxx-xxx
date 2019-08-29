package com.xxx.lz.web.dal.dao;

import com.xxx.lz.web.dal.dataobj.AyangwBlacklist;
import com.xxx.lz.web.dal.dataobj.AyangwBlacklistExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AyangwBlacklistMapper {
    long countByExample(AyangwBlacklistExample example);

    int deleteByExample(AyangwBlacklistExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AyangwBlacklist record);

    int insertSelective(AyangwBlacklist record);

    List<AyangwBlacklist> selectByExampleWithBLOBs(AyangwBlacklistExample example);

    List<AyangwBlacklist> selectByExample(AyangwBlacklistExample example);

    AyangwBlacklist selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AyangwBlacklist record, @Param("example") AyangwBlacklistExample example);

    int updateByExampleWithBLOBs(@Param("record") AyangwBlacklist record, @Param("example") AyangwBlacklistExample example);

    int updateByExample(@Param("record") AyangwBlacklist record, @Param("example") AyangwBlacklistExample example);

    int updateByPrimaryKeySelective(AyangwBlacklist record);

    int updateByPrimaryKeyWithBLOBs(AyangwBlacklist record);

    int updateByPrimaryKey(AyangwBlacklist record);
}