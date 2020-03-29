package jx.stjh.demo03complete.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import jx.stjh.demo03complete.dao.SysDictDao;
import jx.stjh.demo03complete.entity.SysDict;
import jx.stjh.demo03complete.service.SysDictService;
import org.springframework.stereotype.Service;

/**
 * 字典表(SysDict)表服务实现类
 *
 * @author Zlk
 * @since 2020-03-23 10:43:10
 */
@Service("sysDictService")
public class SysDictServiceImpl extends ServiceImpl<SysDictDao, SysDict> implements SysDictService {

}