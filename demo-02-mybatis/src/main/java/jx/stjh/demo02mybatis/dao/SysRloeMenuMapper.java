package jx.stjh.demo02mybatis.dao;

import jx.stjh.demo02mybatis.model.SysRloeMenu;

public interface SysRloeMenuMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysRloeMenu record);

    int insertSelective(SysRloeMenu record);

    SysRloeMenu selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysRloeMenu record);

    int updateByPrimaryKey(SysRloeMenu record);
}