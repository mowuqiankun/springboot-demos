package jx.stjh.demo03complete.entity;

import java.util.Date;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

/**
 * 菜单管理(SysMenu)表实体类
 *
 * @author Zlk
 * @since 2020-03-23 10:43:10
 */
@SuppressWarnings("serial")
@ApiModel("菜单管理")
public class SysMenu extends Model<SysMenu> {

    /**
    *  编号
    */
    @ApiModelProperty("编号")
    private Long id;

    /**
    *  菜单名称
    */
    @ApiModelProperty("菜单名称")
    private String name;

    /**
    *  父菜单ID，一级菜单为0
    */
    @ApiModelProperty("父菜单ID，一级菜单为0")
    private Long parentId;

    /**
    *  菜单URL,类型：1.普通页面（如用户管理， /sys/user） 2.嵌套完整外部页面，以http(s)开头的链接 3.嵌套服务器页面，使用iframe:前缀+目标URL(如SQL监控， iframe:/druid/login.html, iframe:前缀会替换成服务器地址)
    */
    @ApiModelProperty("菜单URL,类型：1.普通页面（如用户管理， /sys/user） 2.嵌套完整外部页面，以http(s)开头的链接 3.嵌套服务器页面，使用iframe:前缀+目标URL(如SQL监控， iframe:/druid/login.html, iframe:前缀会替换成服务器地址)")
    private String url;

    /**
    *  授权(多个用逗号分隔，如：sys:user:add,sys:user:edit)
    */
    @ApiModelProperty("授权(多个用逗号分隔，如：sys:user:add,sys:user:edit)")
    private String perms;

    /**
    *  类型   0：目录   1：菜单   2：按钮
    */
    @ApiModelProperty("类型   0：目录   1：菜单   2：按钮")
    private Integer type;

    /**
    *  菜单图标
    */
    @ApiModelProperty("菜单图标")
    private String icon;

    /**
    *  排序
    */
    @ApiModelProperty("排序")
    private Integer orderNum;

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

    /**
    *  是否删除  -1：已删除  0：正常
    */
    @ApiModelProperty("是否删除  -1：已删除  0：正常")
    private Integer delFlag;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPerms() {
        return perms;
    }

    public void setPerms(String perms) {
        this.perms = perms;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Integer getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
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

    public Integer getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
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