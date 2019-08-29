package com.xxx.lz.web.dal.dao;

import com.xxx.lz.web.dal.dataobj.IfOrder;
import com.xxx.lz.web.dal.dataobj.IfOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IfOrderMapper {
    long countByExample(IfOrderExample example);

    int deleteByExample(IfOrderExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(IfOrder record);

    int insertSelective(IfOrder record);

    List<IfOrder> selectByExample(IfOrderExample example);

    IfOrder selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") IfOrder record, @Param("example") IfOrderExample example);

    int updateByExample(@Param("record") IfOrder record, @Param("example") IfOrderExample example);

    int updateByPrimaryKeySelective(IfOrder record);

    int updateByPrimaryKey(IfOrder record);
}