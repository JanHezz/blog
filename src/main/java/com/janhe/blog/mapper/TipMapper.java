package com.janhe.blog.mapper;

import com.janhe.blog.pojo.Tip;
import com.janhe.blog.pojo.TipExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TipMapper {
    int countByExample(TipExample example);

    int deleteByExample(TipExample example);

    int deleteByPrimaryKey(String oid);

    int insert(Tip record);

    int insertSelective(Tip record);

    List<Tip> selectByExample(TipExample example);

    Tip selectByPrimaryKey(String oid);

    int updateByExampleSelective(@Param("record") Tip record, @Param("example") TipExample example);

    int updateByExample(@Param("record") Tip record, @Param("example") TipExample example);

    int updateByPrimaryKeySelective(Tip record);

    int updateByPrimaryKey(Tip record);
}