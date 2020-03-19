package jx.stjh.demo02mybatis.dao;

import jx.stjh.demo02mybatis.model.SysMenu;

import java.util.List;

public interface SysMenuMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysMenu record);

    int insertSelective(SysMenu record);

    SysMenu selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysMenu record);

    int updateByPrimaryKey(SysMenu record);

    /**
     * @param userName
     * @return
     */
    List<SysMenu> getMenuListByUserName(String userName);
}