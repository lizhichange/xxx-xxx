package com.xxx.lz.web.dal.dao;

import com.xxx.lz.web.dal.dataobj.AyangwGoods;
import com.xxx.lz.web.dal.dataobj.AyangwGoodsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AyangwGoodsMapper {
    long countByExample(AyangwGoodsExample example);

    int deleteByExample(AyangwGoodsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AyangwGoods record);

    int insertSelective(AyangwGoods record);

    List<AyangwGoods> selectByExampleWithBLOBs(AyangwGoodsExample example);

    List<AyangwGoods> selectByExample(AyangwGoodsExample example);

    AyangwGoods selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AyangwGoods record, @Param("example") AyangwGoodsExample example);

    int updateByExampleWithBLOBs(@Param("record") AyangwGoods record, @Param("example") AyangwGoodsExample example);

    int updateByExample(@Param("record") AyangwGoods record, @Param("example") AyangwGoodsExample example);

    int updateByPrimaryKeySelective(AyangwGoods record);

    int updateByPrimaryKeyWithBLOBs(AyangwGoods record);

    int updateByPrimaryKey(AyangwGoods record);
}