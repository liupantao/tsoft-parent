package com.tsoft.user.security.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @ClassName Menu
 * @Description: TODO
 * @Author liupantao
 * @String 2019/12/24
 * @Version V1.0
 **/
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("sys_menu")
public class Menu implements Serializable {


    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 父级编号
     */
    @TableId(value = "parent_id")
    private Integer parentId;

    /**
     * 所有父级编号
     */
    @TableId(value = "parent_ids")
    private String parentIds;

    /**
     * 名称
     */
    @TableId(value = "name")
    private String name;

    /**
     * 排序
     */
    @TableId(value = "sort")
    private String sort;

    /**
     * 链接
     */
    @TableId(value = "href")
    private String href;

    /**
     * 目标
     */
    @TableId(value = "target")
    private String target;

    /**
     * 图标
     */
    @TableId(value = "icon")
    private String icon;

    /**
     * 是否在菜单中显示
     */
    @TableId(value = "is_show")
    private String isShow;

    /**
     * 权限标识
     */
    @TableId(value = "permission")
    private String permission;

    /**
     * 创建者
     */
    @TableId(value = "create_by")
    private String createBy;

    /**
     * 创建时间
     */
    @TableId(value = "create_date")
    private String createDate;

    /**
     * 更新者
     */
    @TableId(value = "update_by")
    private String updateBy;

    /**
     * 更新时间
     */
    @TableId(value = "update_date")
    private String updateDate;

    /**
     * 备注信息
     */
    @TableId(value = "remarks")
    private String remarks;

    /**
     * 删除标记
     */
    @TableId(value = "del_flag")
    private String delFlag;




}
