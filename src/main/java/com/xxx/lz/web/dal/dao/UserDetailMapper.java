package com.xxx.lz.web.dal.dao;

import com.xxx.lz.web.dal.dataobj.UserDetail;
import com.xxx.lz.web.dal.dataobj.UserDetailExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDetailMapper {
    long countByExample(UserDetailExample example);

    int deleteByExample(UserDetailExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserDetail record);

    int insertSelective(UserDetail record);

    List<UserDetail> selectByExample(UserDetailExample example);

    UserDetail selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserDetail record, @Param("example") UserDetailExample example);

    int updateByExample(@Param("record") UserDetail record, @Param("example") UserDetailExample example);

    int updateByPrimaryKeySelective(UserDetail record);

    int updateByPrimaryKey(UserDetail record);
}