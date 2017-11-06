package com.ssmsping.dao;

import com.work.pojo.Mobilepo;
import com.work.pojo.MobilepoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MobilepoMapper {
    long countByExample(MobilepoExample example);

    int deleteByExample(MobilepoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Mobilepo record);

    int insertSelective(Mobilepo record);

    List<Mobilepo> selectByExample(MobilepoExample example);

    Mobilepo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Mobilepo record, @Param("example") MobilepoExample example);

    int updateByExample(@Param("record") Mobilepo record, @Param("example") MobilepoExample example);

    int updateByPrimaryKeySelective(Mobilepo record);

    int updateByPrimaryKey(Mobilepo record);
}