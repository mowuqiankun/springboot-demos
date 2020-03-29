package jx.stjh.demo03complete.service;

import com.baomidou.mybatisplus.extension.service.IService;
import jx.stjh.demo03complete.entity.SysMenu;
import jx.stjh.demo03complete.entity.SysRole;
import jx.stjh.demo03complete.entity.SysUser;

import java.util.List;
import java.util.Set;

/**
 * 用户管理(SysUser)表服务接口
 *
 * @author Zlk
 * @since 2020-03-23 10:43:10
 */
public interface SysUserService extends IService<SysUser> {
    SysUser findSysUserByUserName(String userName);

    /**
     * 通过用户名，查找具有的角色集合；
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

    /**
     * 通过用户名，查找具有的权限集合；
     * @param userName
     * @return
     */
    List<SysMenu> getMenuListByUserName(String userName);

    Set<String> getMenuUrlSetByUserName(String userName);

}