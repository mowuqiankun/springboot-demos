package jx.stjh.demo03complete.entity;

import java.util.Date;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

/**
 * 系统配置表(SysConfig)表实体类
 *
 * @author Zlk
 * @since 2020-03-23 10:43:05
 */
@SuppressWarnings("serial")
@ApiModel("系统配置表")
public class SysConfig extends Model<SysConfig> {

    /**
    *  编号
    */
    @ApiModelProperty("编号")
    private Long id;

    /**
    *  数据值
    */
    @ApiModelProperty("数据值")
    private String value;

    /**
    *  标签名
    */
    @ApiModelProperty("标签名")
    private String label;

    /**
    *  类型
    */
    @ApiModelProperty("类型")
    private String type;

    /**
    *  描述
    */
    @ApiModelProperty("描述")
    private String description;

    /**
    *  排序（升序）
    */
    @ApiModelProperty("排序（升序）")
    private Double sort;

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
    *  备注信息
    */
    @ApiModelProperty("备注信息")
    private String remarks;

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

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getSort() {
        return sort;
    }

    public void setSort(Double sort) {
        this.sort = sort;
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

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
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