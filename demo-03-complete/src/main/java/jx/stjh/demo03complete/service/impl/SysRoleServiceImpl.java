package jx.stjh.demo03complete.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import jx.stjh.demo03complete.dao.SysRoleDao;
import jx.stjh.demo03complete.entity.SysRole;
import jx.stjh.demo03complete.service.SysRoleService;
import org.springframework.stereotype.Service;

/**
 * 角色管理(SysRole)表服务实现类
 *
 * @author Zlk
 * @since 2020-03-23 10:43:10
 */
@Service("sysRoleService")
public class SysRoleServiceImpl extends ServiceImpl<SysRoleDao, SysRole> implements SysRoleService {

}