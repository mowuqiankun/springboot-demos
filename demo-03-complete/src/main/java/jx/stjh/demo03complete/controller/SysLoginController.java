package jx.stjh.demo03complete.controller;

import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import io.swagger.annotations.Api;
import jx.stjh.demo03complete.service.SysUserService;
import jx.stjh.demo03complete.util.ValidationGroups;
import jx.stjh.demo03complete.vo.LoginBean;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;

/**
 * @Description: 登陆controller
 * @Author: Zlk
 * @Date: 2020/3/23 16:57
 */
@Api("登陆控制")
@RestController
public class SysLoginController extends ApiController {
    @Resource
    private SysUserService sysUserService;

    @PostMapping("/login")
    public R getSysUserByname(@Validated(ValidationGroups.Select.class) @RequestBody LoginBean loginBean){
        //判断BindingResult中是否有错误信息
        return success(sysUserService.findSysUserByUserName(loginBean.getAccount()));
    }
}