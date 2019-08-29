package com.xxx.lz.web.dal.dao;

import com.xxx.lz.web.dal.dataobj.IfType;
import com.xxx.lz.web.dal.dataobj.IfTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IfTypeMapper {
    long countByExample(IfTypeExample example);

    int deleteByExample(IfTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(IfType record);

    int insertSelective(IfType record);

    List<IfType> selectByExample(IfTypeExample example);

    IfType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") IfType record, @Param("example") IfTypeExample example);

    int updateByExample(@Param("record") IfType record, @Param("example") IfTypeExample example);

    int updateByPrimaryKeySelective(IfType record);

    int updateByPrimaryKey(IfType record);
}