package com.xxx.lz.web.dal.dao;

import com.xxx.lz.web.dal.dataobj.AyangwOrder;
import com.xxx.lz.web.dal.dataobj.AyangwOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AyangwOrderMapper {
    long countByExample(AyangwOrderExample example);

    int deleteByExample(AyangwOrderExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AyangwOrder record);

    int insertSelective(AyangwOrder record);

    List<AyangwOrder> selectByExample(AyangwOrderExample example);

    AyangwOrder selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AyangwOrder record, @Param("example") AyangwOrderExample example);

    int updateByExample(@Param("record") AyangwOrder record, @Param("example") AyangwOrderExample example);

    int updateByPrimaryKeySelective(AyangwOrder record);

    int updateByPrimaryKey(AyangwOrder record);
}