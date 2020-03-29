package jx.stjh.demo03complete.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import jx.stjh.demo03complete.dao.SysRoleDeptDao;
import jx.stjh.demo03complete.entity.SysRoleDept;
import jx.stjh.demo03complete.service.SysRoleDeptService;
import org.springframework.stereotype.Service;

/**
 * 角色机构(SysRoleDept)表服务实现类
 *
 * @author Zlk
 * @since 2020-03-23 10:43:10
 */
@Service("sysRoleDeptService")
public class SysRoleDeptServiceImpl extends ServiceImpl<SysRoleDeptDao, SysRoleDept> implements SysRoleDeptService {

}