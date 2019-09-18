package com.xxx.lz.web.dal.dao;

import com.xxx.lz.web.dal.dataobj.IfSyslog;
import com.xxx.lz.web.dal.dataobj.IfSyslogExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IfSyslogMapper {
    long countByExample(IfSyslogExample example);

    int deleteByExample(IfSyslogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(IfSyslog record);

    int insertSelective(IfSyslog record);

    List<IfSyslog> selectByExampleWithBLOBs(IfSyslogExample example);

    List<IfSyslog> selectByExample(IfSyslogExample example);

    IfSyslog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") IfSyslog record, @Param("example") IfSyslogExample example);

    int updateByExampleWithBLOBs(@Param("record") IfSyslog record, @Param("example") IfSyslogExample example);

    int updateByExample(@Param("record") IfSyslog record, @Param("example") IfSyslogExample example);

    int updateByPrimaryKeySelective(IfSyslog record);

    int updateByPrimaryKeyWithBLOBs(IfSyslog record);

    int updateByPrimaryKey(IfSyslog record);
}