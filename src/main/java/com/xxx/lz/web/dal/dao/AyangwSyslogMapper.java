package com.xxx.lz.web.dal.dao;

import com.xxx.lz.web.dal.dataobj.AyangwSyslog;
import com.xxx.lz.web.dal.dataobj.AyangwSyslogExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AyangwSyslogMapper {
    long countByExample(AyangwSyslogExample example);

    int deleteByExample(AyangwSyslogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AyangwSyslog record);

    int insertSelective(AyangwSyslog record);

    List<AyangwSyslog> selectByExampleWithBLOBs(AyangwSyslogExample example);

    List<AyangwSyslog> selectByExample(AyangwSyslogExample example);

    AyangwSyslog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AyangwSyslog record, @Param("example") AyangwSyslogExample example);

    int updateByExampleWithBLOBs(@Param("record") AyangwSyslog record, @Param("example") AyangwSyslogExample example);

    int updateByExample(@Param("record") AyangwSyslog record, @Param("example") AyangwSyslogExample example);

    int updateByPrimaryKeySelective(AyangwSyslog record);

    int updateByPrimaryKeyWithBLOBs(AyangwSyslog record);

    int updateByPrimaryKey(AyangwSyslog record);
}