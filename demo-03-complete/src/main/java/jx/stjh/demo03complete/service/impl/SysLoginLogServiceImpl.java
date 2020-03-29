package jx.stjh.demo03complete.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import jx.stjh.demo03complete.dao.SysLoginLogDao;
import jx.stjh.demo03complete.entity.SysLoginLog;
import jx.stjh.demo03complete.service.SysLoginLogService;
import org.springframework.stereotype.Service;

/**
 * 系统登录日志(SysLoginLog)表服务实现类
 *
 * @author Zlk
 * @since 2020-03-23 10:43:10
 */
@Service("sysLoginLogService")
public class SysLoginLogServiceImpl extends ServiceImpl<SysLoginLogDao, SysLoginLog> implements SysLoginLogService {

}