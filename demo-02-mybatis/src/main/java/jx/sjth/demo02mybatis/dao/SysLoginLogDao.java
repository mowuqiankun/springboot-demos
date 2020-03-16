package jx.sjth.demo02mybatis.dao;

import jx.sjth.demo02mybatis.model.SysLoginLog;

public interface SysLoginLogDao {
    int deleteByPrimaryKey(Long id);

    int insert(SysLoginLog record);

    int insertSelective(SysLoginLog record);

    SysLoginLog selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysLoginLog record);

    int updateByPrimaryKey(SysLoginLog record);
}