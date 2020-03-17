package jx.stjh.demo02mybatis.service.impl;

import jx.stjh.demo02mybatis.dao.SysUserMapper;
import jx.stjh.demo02mybatis.model.SysUser;
import jx.stjh.demo02mybatis.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description: TODO
 * @author: Zlk
 * @date: 2020/3/1716:04
 */
@Service
public class SysUserServiceImpl implements SysUserService {
    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public List<SysUser> findAll() {
        return sysUserMapper.findAll();
    }
}
