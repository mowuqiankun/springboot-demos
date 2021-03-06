package jx.stjh.demo03complete.entity;

import java.util.Date;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

/**
 * 用户角色(SysUserRole)表实体类
 *
 * @author Zlk
 * @since 2020-03-23 10:43:10
 */
@SuppressWarnings("serial")
@ApiModel("用户角色")
public class SysUserRole extends Model<SysUserRole> {

    /**
    *  编号
    */
    @ApiModelProperty("编号")
    private Long id;

    /**
    *  用户ID
    */
    @ApiModelProperty("用户ID")
    private Long userId;

    /**
    *  角色ID
    */
    @ApiModelProperty("角色ID")
    private Long roleId;

    /**
    *  创建人
    */
    @ApiModelProperty("创建人")
    private String createBy;

    /**
    *  创建时间
    */
    @ApiModelProperty("创建时间")
    private Date createTime;

    /**
    *  更新人
    */
    @ApiModelProperty("更新人")
    private String lastUpdateBy;

    /**
    *  更新时间
    */
    @ApiModelProperty("更新时间")
    private Date lastUpdateTime;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getLastUpdateBy() {
        return lastUpdateBy;
    }

    public void setLastUpdateBy(String lastUpdateBy) {
        this.lastUpdateBy = lastUpdateBy;
    }

    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    /**
     * 获取主键值
     *
     * @return 主键值
     */
    @Override
    protected Serializable pkVal() {
        return this.id;
    }
    }