package jx.stjh.demo03complete.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import jx.stjh.demo03complete.entity.SysMenu;
import jx.stjh.demo03complete.entity.SysRole;
import jx.stjh.demo03complete.entity.SysUser;

import java.util.List;

/**
 * 用户管理(SysUser)表数据库访问层
 *
 * @author Zlk
 * @since 2020-03-23 10:43:10
 */
public interface SysUserDao extends BaseMapper<SysUser> {
    /**
     * 通过用户名，查找具有的角色集合；
     * @param userName
     * @return
     */
    List<SysRole> findSysRoleByUserName(String userName);

    /**
     * 通过用户名，查找具有的权限集合；
     * @param userName
     * @return
     */
    List<SysMenu> getMenuListByUserName(String userName);
}