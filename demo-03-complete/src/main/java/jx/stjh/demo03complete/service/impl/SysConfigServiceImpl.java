package jx.stjh.demo03complete.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import jx.stjh.demo03complete.dao.SysConfigDao;
import jx.stjh.demo03complete.entity.SysConfig;
import jx.stjh.demo03complete.service.SysConfigService;
import org.springframework.stereotype.Service;

/**
 * 系统配置表(SysConfig)表服务实现类
 *
 * @author Zlk
 * @since 2020-03-23 10:43:08
 */
@Service("sysConfigService")
public class SysConfigServiceImpl extends ServiceImpl<SysConfigDao, SysConfig> implements SysConfigService {

}