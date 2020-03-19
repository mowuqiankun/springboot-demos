package jx.stjh.demo02mybatis.dao;

import jx.stjh.demo02mybatis.model.SysRole;

import java.util.List;

public interface SysRoleMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysRole record);

    int insertSelective(SysRole record);

    SysRole selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysRole record);

    int updateByPrimaryKey(SysRole record);

    /**
     * 通过username获取角色List
     * @param userName 用户名
     * @return
     */
    List<SysRole> findSysRoleByUserName(String userName);
}