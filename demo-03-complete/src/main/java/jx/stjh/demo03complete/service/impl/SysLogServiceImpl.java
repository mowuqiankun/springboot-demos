package jx.stjh.demo03complete.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import jx.stjh.demo03complete.dao.SysLogDao;
import jx.stjh.demo03complete.entity.SysLog;
import jx.stjh.demo03complete.service.SysLogService;
import org.springframework.stereotype.Service;

/**
 * 系统操作日志(SysLog)表服务实现类
 *
 * @author Zlk
 * @since 2020-03-23 10:43:10
 */
@Service("sysLogService")
public class SysLogServiceImpl extends ServiceImpl<SysLogDao, SysLog> implements SysLogService {

}