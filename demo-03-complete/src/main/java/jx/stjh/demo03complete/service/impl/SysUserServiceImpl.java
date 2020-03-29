package jx.stjh.demo03complete.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import jx.stjh.demo03complete.dao.SysUserDao;
import jx.stjh.demo03complete.entity.SysMenu;
import jx.stjh.demo03complete.entity.SysRole;
import jx.stjh.demo03complete.entity.SysUser;
import jx.stjh.demo03complete.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 用户管理(SysUser)表服务实现类
 *
 * @author Zlk
 * @since 2020-03-23 10:43:10
 */
@Service("sysUserService")
public class SysUserServiceImpl extends ServiceImpl<SysUserDao, SysUser> implements SysUserService {
    @Resource
    private SysUserDao sysUserDao;

    @Override
    public SysUser findSysUserByUserName(String userName) {
        //通过数据库字段
//        return sysUserDao.selectList(new QueryWrapper<SysUser>().eq("name",userName));
        //通过bean
//        return sysUserDao.selectList(new QueryWrapper<SysUser>().lambda().eq(SysUser::getName, userName));
        return sysUserDao.selectOne(new QueryWrapper<SysUser>().lambda().eq(SysUser::getName, userName));
    }

    @Override
    public List<SysRole> findSysRoleByUserName(String userName) {
        return sysUserDao.findSysRoleByUserName(userName);
    }

    @Override
    public List<SysMenu> getMenuListByUserName(String userName) {
        return sysUserDao.getMenuListByUserName(userName);
    }

    @Override
    public Set<String> findSysRoleSetByUserName(String userName) {
        Set<String> set = null;
        List<SysRole> sysRoleList = sysUserDao.findSysRoleByUserName(userName);

        if (sysRoleList != null && sysRoleList.size() > 0) {
            set = new HashSet<>();
            for (SysRole sysRole : sysRoleList) {
                set.add(sysRole.getName());
            }
        }
        return set;
    }

    @Override
    public Set<String> getMenuUrlSetByUserName(String userName) {
        Set<String> permissonSet = null;
        List<SysMenu> menuList = sysUserDao.getMenuListByUserName(userName);
        if (menuList != null && menuList.size() > 0) {
            permissonSet = new HashSet<String>();
            for (SysMenu sysMenu : menuList) {
                permissonSet.add(sysMenu.getUrl());
            }
        }
        return permissonSet;
    }
}