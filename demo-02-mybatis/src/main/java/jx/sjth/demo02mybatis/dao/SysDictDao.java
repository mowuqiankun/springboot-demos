package jx.sjth.demo02mybatis.dao;

import jx.sjth.demo02mybatis.model.SysDict;

public interface SysDictDao {
    int deleteByPrimaryKey(Long id);

    int insert(SysDict record);

    int insertSelective(SysDict record);

    SysDict selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysDict record);

    int updateByPrimaryKey(SysDict record);
}