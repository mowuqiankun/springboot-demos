package jx.stjh.demo02mybatis.shiro;

import jx.stjh.demo02mybatis.model.SysUser;
import jx.stjh.demo02mybatis.service.SysMenuService;
import jx.stjh.demo02mybatis.service.SysRoleService;
import jx.stjh.demo02mybatis.service.SysUserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Description: 自定义Ream
 * @author: Zlk
 * @Date: 2020/3/19 15:24
 */
public class MyRealm extends AuthorizingRealm {
    @Autowired
    private SysUserService sysUserService;
    @Autowired
    private SysRoleService sysRoleService;
    @Autowired
    private SysMenuService sysMenuService;

    /**
     * 为当前登录成功的用户授予权限和分配角色。
     *
     * @param principalCollection
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        // 获取用户名
        String username = (String) principalCollection.getPrimaryPrincipal();
        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
        // 给该用户设置角色(角色名称)
        authorizationInfo.setRoles(sysRoleService.findSysRoleSetByUserName(username));
        // 给该用户设置权限（菜单类型的URL路径）
        authorizationInfo.setStringPermissions(this.sysMenuService.getMenuUrlSetByUserName(username));
        return authorizationInfo;
    }

    /**
     * 用来验证当前登录的用户，获取认证信息。
     *
     * @param authenticationToken
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        // 根据 Token 获取用户名，如果您不知道该 Token 怎么来的，先可以不管，下文会解释
        String username = (String) authenticationToken.getPrincipal();
        // 根据用户名从数据库中查询该用户
        SysUser sysUser = sysUserService.selectByUserName(username);
        if (sysUser != null) {
            // 把当前用户存到 Session 中
            SecurityUtils.getSubject().getSession().setAttribute("sysUser", sysUser);
            // 传入用户名和密码进行身份认证，并返回认证信息
            AuthenticationInfo authcInfo = new SimpleAuthenticationInfo(sysUser.getName(), sysUser.getPassword(), "myRealm");
            return authcInfo;
        } else {
            return null;
        }
    }
}