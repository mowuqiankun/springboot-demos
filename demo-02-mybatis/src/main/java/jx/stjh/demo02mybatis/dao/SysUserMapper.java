package jx.stjh.demo02mybatis.dao;

import jx.stjh.demo02mybatis.model.SysUser;

import java.util.List;
public interface SysUserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysUser record);

    int insertSelective(SysUser record);

    SysUser selectByPrimaryKey(Long id);

    /**
     * 通过用户名获取用户对象
     * @param userName
     * @return
     */
    SysUser selectByUserName(String userName);

    int updateByPrimaryKeySelective(SysUser record);

    int updateByPrimaryKey(SysUser record);

    /**
     * 查询全部
     *
     * @return
     */
    List<SysUser> findAll();
}