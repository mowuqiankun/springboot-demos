package jx.sjth.demo02mybatis.dao;

import jx.sjth.demo02mybatis.model.SysMenu;

public interface SysMenuDao {
    int deleteByPrimaryKey(Long id);

    int insert(SysMenu record);

    int insertSelective(SysMenu record);

    SysMenu selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysMenu record);

    int updateByPrimaryKey(SysMenu record);
}