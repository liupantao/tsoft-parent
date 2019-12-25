package com.tsoft.user.security.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @ClassName Role
 * @Description: TODO
 * @Author liupantao
 * @String 2019/12/24
 * @Version V1.0
 **/

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("sys_role")
public class Role implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 编号
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 角色名称
     */
    @TableId(value = "name")
    private String name;

    /**
     * 英文名称
     */
    @TableId(value = "enname")
    private String enname;

    /**
     * 数据范围
     */
    @TableId(value = "data_scope")
    private String dataScope;

    /**
     * 角色类型
     */
    @TableId(value = "role_type")
    private String roleType;

    /**
     * 是否系统数据
     */
    @TableId(value = "is_sys")
    private String isSys;

    /**
     * 是否可用
     */
    @TableId(value = "useable")
    private String  useable;

    /**
     * 创建者
     */
    @TableId(value = "create_by")
    private String  createBy;

    /**
     * 创建时间
     */
    @TableId(value = "createDate")
    private String createDate;

    /**
     * 更新者
     */
    @TableId(value = "update_by")
    private String  updateBy;

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
    @TableId(value = "delFlag")
    private String delFlag;


}
