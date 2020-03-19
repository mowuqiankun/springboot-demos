package jx.stjh.demo02mybatis.service;

import jx.stjh.demo02mybatis.model.SysMenu;

import java.util.List;
import java.util.Set;

/**
 * @Description:
 * @Auther: Zlk
 * @Date: 2020/3/19 15:04
 */
public interface SysMenuService {
    /**
     *
     * @param userName
     * @return
     */
    List<SysMenu> getMenuListByUserName(String userName);

    Set<String> getMenuUrlSetByUserName(String userName);
}
