package jx.sjth.demo02mybatis.dao;

import jx.sjth.demo02mybatis.model.SysConfig;

public interface SysConfigDao {
    int deleteByPrimaryKey(Long id);

    int insert(SysConfig record);

    int insertSelective(SysConfig record);

    SysConfig selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysConfig record);

    int updateByPrimaryKey(SysConfig record);
}