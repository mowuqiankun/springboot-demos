package jx.sjth.demo02mybatis.dao;

import jx.sjth.demo02mybatis.model.SysLog;

public interface SysLogDao {
    int deleteByPrimaryKey(Long id);

    int insert(SysLog record);

    int insertSelective(SysLog record);

    SysLog selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysLog record);

    int updateByPrimaryKey(SysLog record);
}