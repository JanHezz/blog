package com.janhe.blog.mapper;

import com.janhe.blog.pojo.BlogInfo;
import com.janhe.blog.pojo.BlogInfoExample;
import com.janhe.blog.pojo.BlogInfoWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BlogInfoMapper {
    int countByExample(BlogInfoExample example);

    int deleteByExample(BlogInfoExample example);

    int deleteByPrimaryKey(Integer oid);

    int insert(BlogInfoWithBLOBs record);

    int insertSelective(BlogInfoWithBLOBs record);

    List<BlogInfoWithBLOBs> selectByExampleWithBLOBs(BlogInfoExample example);

    List<BlogInfo> selectByExample(BlogInfoExample example);

    BlogInfoWithBLOBs selectByPrimaryKey(Integer oid);

    int updateByExampleSelective(@Param("record") BlogInfoWithBLOBs record, @Param("example") BlogInfoExample example);

    int updateByExampleWithBLOBs(@Param("record") BlogInfoWithBLOBs record, @Param("example") BlogInfoExample example);

    int updateByExample(@Param("record") BlogInfo record, @Param("example") BlogInfoExample example);

    int updateByPrimaryKeySelective(BlogInfoWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(BlogInfoWithBLOBs record);

    int updateByPrimaryKey(BlogInfo record);
}