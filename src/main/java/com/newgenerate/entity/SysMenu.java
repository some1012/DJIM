package com.newgenerate.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 
 * </p>
 *
 * @author sor
 * @since 2022-09-02 09:57:41
 */
@Getter
@Setter
@TableName("sys_menu")
@ApiModel(value = "SysMenu对象", description = "")
public class SysMenu {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty("父菜单ID，一级菜单为0")
    @TableField("parent_id")
    private Long parentId;

    @TableField("name")
    private String name;

    @ApiModelProperty("菜单URL")
    @TableField("path")
    private String path;

    @ApiModelProperty("授权(多个用逗号分隔，如：user:list,user:create)")
    @TableField("perms")
    private String perms;

    @TableField("component")
    private String component;

    @ApiModelProperty("类型     0：目录   1：菜单   2：按钮")
    @TableField("type")
    private Integer type;

    @ApiModelProperty("菜单图标")
    @TableField("icon")
    private String icon;

    @ApiModelProperty("排序")
    @TableField("orderNum")
    private Integer orderNum;

    @TableField("created")
    private LocalDateTime created;

    @TableField("updated")
    private LocalDateTime updated;

    @TableField("statu")
    private Integer statu;


}
