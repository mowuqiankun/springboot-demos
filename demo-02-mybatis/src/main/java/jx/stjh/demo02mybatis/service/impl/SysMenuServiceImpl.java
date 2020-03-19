package jx.stjh.demo02mybatis.service.impl;

import jx.stjh.demo02mybatis.dao.SysMenuMapper;
import jx.stjh.demo02mybatis.model.SysMenu;
import jx.stjh.demo02mybatis.service.SysMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @Description:
 * @Auther: Zlk
 * @Date: 2020/3/19 15:06
 */

@Service
public class SysMenuServiceImpl implements SysMenuService {
    @Autowired
    private SysMenuMapper sysMenuMapper;

    @Override
    public List<SysMenu> getMenuListByUserName(String userName) {
        return sysMenuMapper.getMenuListByUserName(userName);
    }

    /**
     * 通过用户名，获取到当前用户所有可以操作的菜单URL路径，传给shiro权限框架
     * @param userName
     * @return
     */
    @Override
    public Set<String> getMenuUrlSetByUserName(String userName) {
        Set<String> permissonSet=null;
        List<SysMenu> menuList = sysMenuMapper.getMenuListByUserName(userName);
        if (menuList!=null && menuList.size()>0){
            permissonSet = new HashSet<String>();
            for (SysMenu sysMenu : menuList) {
                if(sysMenu.getType()==1){
                    permissonSet.add(sysMenu.getUrl());
                }
            }
        }
        return permissonSet;
    }
}