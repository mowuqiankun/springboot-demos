package jx.stjh.demo02mybatis.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import jx.stjh.demo02mybatis.model.SysUser;

import java.util.List;
import java.util.Set;

/**
 * @description: TODO
 * @author: Zlk
 * @date: 2020/3/1716:04
 */
public interface SysUserService {
    List<SysUser> findAll();

    PageInfo<SysUser> selectByPage(Integer page,Integer size);

    /**
     * 通过用户名获取用户对象
     * @param userName
     * @return
     */
    SysUser selectByUserName(String userName);
}