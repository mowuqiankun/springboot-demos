package jx.stjh.demo02mybatis.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import jx.stjh.demo02mybatis.service.SysMenuService;
import jx.stjh.demo02mybatis.service.SysRoleService;
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
    @Autowired
    private SysRoleService sysRoleService;
    @Autowired
    private SysMenuService sysMenuService;

    @ApiOperation(value = "查找所有用户",notes = "查找全部用户")
    @GetMapping("/findAll")
    public Object findAll(){
        return sysUserService.findAll();
    }

    @ApiOperation(value = "分页接口",notes = "分页例子")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "page",value = "第几页",required = true,dataType = "int"),
            @ApiImplicitParam(name = "size",value = "每页条数",required = true,dataType = "int")
    })
    @GetMapping("/getSysUserPageInfo")
    public Object getSysUserPageInfo(int page, int size){
        return sysUserService.selectByPage(page,size);
    }

    @ApiOperation(value = "用户绑定的角色",notes = "通过用户名查找角色集合")
    @ApiImplicitParam(name = "userName",value = "用户名",required = true,dataType = "String")
    @GetMapping("/getRoleByUserName")
    public Object getSysRoleListByUserName(String userName){
        return this.sysRoleService.findSysRoleByUserName(userName);
    }

    @ApiOperation(value = "用户绑定的角色名称set",notes = "通过用户名查找角色名称set")
    @ApiImplicitParam(name = "userName",value = "用户名",required = true,dataType = "String")
    @GetMapping("/findSysRoleSetByUserName")
    public Object findSysRoleSetByUserName(String userName){
        return this.sysRoleService.findSysRoleSetByUserName(userName);
    }

    @ApiOperation("通过用户名获取资源权限")
    @ApiImplicitParam(name = "userName",value = "用户名",required = true,dataType = "String")
    @GetMapping("/getSysMenuListByUserName")
    public Object getSysMenuListByUserName(String userName){
        return this.sysMenuService.getMenuListByUserName(userName);
    }

    @ApiOperation("通过用户名获取菜单资源URL路径")
    @ApiImplicitParam(name = "userName",value = "用户名",required = true,dataType = "String")
    @GetMapping("/getMenuUrlSetByUserName")
    public Object getMenuUrlSetByUserName(String userName){
        return this.sysMenuService.getMenuUrlSetByUserName(userName);
    }
}
