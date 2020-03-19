package jx.stjh.demo02mybatis.service.impl;

import jx.stjh.demo02mybatis.dao.SysRoleMapper;
import jx.stjh.demo02mybatis.model.SysRole;
import jx.stjh.demo02mybatis.service.SysRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @Description:角色实现类
 * @Auther: Zlk
 * @Date: 2020/3/19 14:42
 */
@Service
public class SysRoleServiceImpl implements SysRoleService {
    @Autowired
    private SysRoleMapper sysRoleMapper;

    @Override
    public List<SysRole> findSysRoleByUserName(String userName) {
        return sysRoleMapper.findSysRoleByUserName(userName);
    }

    @Override
    public Set<String> findSysRoleSetByUserName(String userName) {
        Set<String> set = null;
        List<SysRole> sysRoleList = sysRoleMapper.findSysRoleByUserName(userName);

        if(sysRoleList!=null && sysRoleList.size()>0){
            set = new HashSet<>();
            for (SysRole sysRole : sysRoleList) {
                set.add(sysRole.getName());
            }
        }
        return set;
    }
}