package jx.stjh.demo02mybatis.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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

    /**
     *  分页（查询第page页，每页size条）
     * @param page 第几页
     * @param size 每页条数
     * @return
     */
    @Override
    public PageInfo<SysUser> selectByPage(Integer page, Integer size) {
        //开始分页
        PageHelper.startPage(page,size);
        //排序
        PageHelper.orderBy("id");
        List<SysUser> sysUserList = this.sysUserMapper.findAll();
        return new PageInfo<SysUser>(sysUserList);
    }

    @Override
    public SysUser selectByUserName(String userName) {
        return sysUserMapper.selectByUserName(userName);
    }
}
