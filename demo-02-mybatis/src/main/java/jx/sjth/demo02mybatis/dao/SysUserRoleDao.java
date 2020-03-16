package jx.sjth.demo02mybatis.dao;

import jx.sjth.demo02mybatis.model.SysUserRole;

public interface SysUserRoleDao {
    int deleteByPrimaryKey(Long id);

    int insert(SysUserRole record);

    int insertSelective(SysUserRole record);

    SysUserRole selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysUserRole record);

    int updateByPrimaryKey(SysUserRole record);
}