package jx.stjh.demo02mybatis.service;

import jx.stjh.demo02mybatis.model.SysRole;

import java.util.List;
import java.util.Set;

/**
 * @Description:角色dao
 * @Auther: Zlk
 * @Date: 2020/3/19 14:21
 */
public interface SysRoleService {
    /**
     * 通过username获取角色List
     * @param userName
     * @return
     */
    List<SysRole> findSysRoleByUserName(String userName);

    /**
     * 获取角色名称set集合
     * @param userName
     * @return
     */
    Set<String> findSysRoleSetByUserName(String userName);
}
