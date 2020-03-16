package jx.sjth.demo02mybatis.dao;

import jx.sjth.demo02mybatis.model.SysRoleMenu;

public interface SysRoleMenuDao {
    int deleteByPrimaryKey(Long id);

    int insert(SysRoleMenu record);

    int insertSelective(SysRoleMenu record);

    SysRoleMenu selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysRoleMenu record);

    int updateByPrimaryKey(SysRoleMenu record);
}