package jx.stjh.demo03complete.vo;

import jx.stjh.demo03complete.util.ValidationGroups;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * @Description:登陆接口封装对象
 * @Author: Zlk
 * @Date: 2020/3/23 16:53
 */
public class LoginBean {
    @NotBlank(message = "用户名不为空",groups = {ValidationGroups.Select.class})
    private String account;
    @NotBlank(message = "密码不为空",groups = {ValidationGroups.Select.class})
    private String password;
    private String captcha;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCaptcha() {
        return captcha;
    }

    public void setCaptcha(String captcha) {
        this.captcha = captcha;
    }
}