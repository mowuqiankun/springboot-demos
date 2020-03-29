package jx.stjh.demo03complete.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import jx.stjh.demo03complete.dao.SysUserRoleDao;
import jx.stjh.demo03complete.entity.SysUserRole;
import jx.stjh.demo03complete.service.SysUserRoleService;
import org.springframework.stereotype.Service;

/**
 * 用户角色(SysUserRole)表服务实现类
 *
 * @author Zlk
 * @since 2020-03-23 10:43:10
 */
@Service("sysUserRoleService")
public class SysUserRoleServiceImpl extends ServiceImpl<SysUserRoleDao, SysUserRole> implements SysUserRoleService {

}