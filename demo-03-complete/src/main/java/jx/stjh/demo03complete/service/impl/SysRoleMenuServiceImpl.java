package jx.stjh.demo03complete.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import jx.stjh.demo03complete.dao.SysRoleMenuDao;
import jx.stjh.demo03complete.entity.SysRoleMenu;
import jx.stjh.demo03complete.service.SysRoleMenuService;
import org.springframework.stereotype.Service;

/**
 * 角色菜单(SysRoleMenu)表服务实现类
 *
 * @author Zlk
 * @since 2020-03-23 10:43:10
 */
@Service("sysRoleMenuService")
public class SysRoleMenuServiceImpl extends ServiceImpl<SysRoleMenuDao, SysRoleMenu> implements SysRoleMenuService {

}