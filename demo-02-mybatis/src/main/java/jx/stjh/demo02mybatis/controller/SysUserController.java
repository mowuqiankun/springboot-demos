package jx.stjh.demo02mybatis.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import jx.stjh.demo02mybatis.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: SysUser控制类
 * @author: Zlk
 * @date: 2020/3/1716:32
 */
@Api("查找类")
@RestController
@RequestMapping("user")
public class SysUserController {
    @Autowired
    private SysUserService sysUserService;

    @ApiOperation("查找所有用户")
    @GetMapping("/findAll")
    public Object findAll(){
        return sysUserService.findAll();
    }
}
