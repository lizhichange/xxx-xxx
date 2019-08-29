package com.xxx.lz.web.dal.dao;

import com.xxx.lz.web.dal.dataobj.IfKm;
import com.xxx.lz.web.dal.dataobj.IfKmExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IfKmMapper {
    long countByExample(IfKmExample example);

    int deleteByExample(IfKmExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(IfKm record);

    int insertSelective(IfKm record);

    List<IfKm> selectByExample(IfKmExample example);

    IfKm selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") IfKm record, @Param("example") IfKmExample example);

    int updateByExample(@Param("record") IfKm record, @Param("example") IfKmExample example);

    int updateByPrimaryKeySelective(IfKm record);

    int updateByPrimaryKey(IfKm record);
}