package jx.stjh.demo03complete.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import jx.stjh.demo03complete.dao.SysMenuDao;
import jx.stjh.demo03complete.entity.SysMenu;
import jx.stjh.demo03complete.service.SysMenuService;
import org.springframework.stereotype.Service;

/**
 * 菜单管理(SysMenu)表服务实现类
 *
 * @author Zlk
 * @since 2020-03-23 10:43:10
 */
@Service("sysMenuService")
public class SysMenuServiceImpl extends ServiceImpl<SysMenuDao, SysMenu> implements SysMenuService {

}