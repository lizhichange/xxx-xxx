package com.xxx.lz.web.dal.dao;

import com.xxx.lz.web.dal.dataobj.IfGoods;
import com.xxx.lz.web.dal.dataobj.IfGoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IfGoodsMapper {
    long countByExample(IfGoodsExample example);

    int deleteByExample(IfGoodsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(IfGoods record);

    int insertSelective(IfGoods record);

    List<IfGoods> selectByExampleWithBLOBs(IfGoodsExample example);

    List<IfGoods> selectByExample(IfGoodsExample example);

    IfGoods selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") IfGoods record, @Param("example") IfGoodsExample example);

    int updateByExampleWithBLOBs(@Param("record") IfGoods record, @Param("example") IfGoodsExample example);

    int updateByExample(@Param("record") IfGoods record, @Param("example") IfGoodsExample example);

    int updateByPrimaryKeySelective(IfGoods record);

    int updateByPrimaryKeyWithBLOBs(IfGoods record);

    int updateByPrimaryKey(IfGoods record);
}