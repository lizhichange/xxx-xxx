package com.xxx.lz.web.dal.dao;

import com.xxx.lz.web.dal.dataobj.IfBlacklist;
import com.xxx.lz.web.dal.dataobj.IfBlacklistExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IfBlacklistMapper {
    long countByExample(IfBlacklistExample example);

    int deleteByExample(IfBlacklistExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(IfBlacklist record);

    int insertSelective(IfBlacklist record);

    List<IfBlacklist> selectByExampleWithBLOBs(IfBlacklistExample example);

    List<IfBlacklist> selectByExample(IfBlacklistExample example);

    IfBlacklist selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") IfBlacklist record, @Param("example") IfBlacklistExample example);

    int updateByExampleWithBLOBs(@Param("record") IfBlacklist record, @Param("example") IfBlacklistExample example);

    int updateByExample(@Param("record") IfBlacklist record, @Param("example") IfBlacklistExample example);

    int updateByPrimaryKeySelective(IfBlacklist record);

    int updateByPrimaryKeyWithBLOBs(IfBlacklist record);

    int updateByPrimaryKey(IfBlacklist record);
}