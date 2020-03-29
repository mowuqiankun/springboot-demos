package jx.stjh.demo03complete.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import jx.stjh.demo03complete.dao.SysDeptDao;
import jx.stjh.demo03complete.entity.SysDept;
import jx.stjh.demo03complete.service.SysDeptService;
import org.springframework.stereotype.Service;

/**
 * 机构管理(SysDept)表服务实现类
 *
 * @author Zlk
 * @since 2020-03-23 10:43:10
 */
@Service("sysDeptService")
public class SysDeptServiceImpl extends ServiceImpl<SysDeptDao, SysDept> implements SysDeptService {

}