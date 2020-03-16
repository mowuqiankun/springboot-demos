package jx.sjth.demo02mybatis.dao;

import jx.sjth.demo02mybatis.model.SysRoleDept;

public interface SysRoleDeptDao {
    int deleteByPrimaryKey(Long id);

    int insert(SysRoleDept record);

    int insertSelective(SysRoleDept record);

    SysRoleDept selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysRoleDept record);

    int updateByPrimaryKey(SysRoleDept record);
}