package jx.sjth.demo02mybatis.dao;

import jx.sjth.demo02mybatis.model.SysDept;

public interface SysDeptDao {
    int deleteByPrimaryKey(Long id);

    int insert(SysDept record);

    int insertSelective(SysDept record);

    SysDept selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysDept record);

    int updateByPrimaryKey(SysDept record);
}