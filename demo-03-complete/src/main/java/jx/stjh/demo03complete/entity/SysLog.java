package jx.stjh.demo03complete.entity;

import java.util.Date;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

/**
 * 系统操作日志(SysLog)表实体类
 *
 * @author Zlk
 * @since 2020-03-23 10:43:10
 */
@SuppressWarnings("serial")
@ApiModel("系统操作日志")
public class SysLog extends Model<SysLog> {

    /**
    *  编号
    */
    @ApiModelProperty("编号")
    private Long id;

    /**
    *  用户名
    */
    @ApiModelProperty("用户名")
    private String userName;

    /**
    *  用户操作
    */
    @ApiModelProperty("用户操作")
    private String operation;

    /**
    *  请求方法
    */
    @ApiModelProperty("请求方法")
    private String method;

    /**
    *  请求参数
    */
    @ApiModelProperty("请求参数")
    private String params;

    /**
    *  执行时长(毫秒)
    */
    @ApiModelProperty("执行时长(毫秒)")
    private Long time;

    /**
    *  IP地址
    */
    @ApiModelProperty("IP地址")
    private String ip;

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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
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