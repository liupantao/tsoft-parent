package com.tsoft.user.security.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName User
 * @Description: TODO
 * @Author liupantao
 * @Date 2019/12/24
 * @Version V1.0
 **/
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("sys_user")
public class  User implements Serializable {

    private static final long serialVersionUID = 1L;
    /**
     * 编号
     */
    /**
     * 主键
     */
    @TableId(value = "user_id", type = IdType.AUTO)
    private Integer id;

    /**
     * 登录名
     */
    @TableId(value = "login_name")
    private String loginName;

    /**
     * 密码
     */
    @TableId(value = "password")
    private String password;

    /**
     * 角色id
     */
    @TableId(value = "role_id")
    private Integer roleId;

    /**
     * 工号
     */
    @TableId(value = "no")
    private String no;

    /**
     * 姓名
     */
    @TableId(value = "name")
    private String name;

    /**
     * 邮箱
     */
    @TableId(value = "email")
    private String email;

    /**
     * 电话
     */
    @TableId(value = "phone")
    private String phone;

    /**
     * 手机
     */
    @TableId(value = "mobile")
    private String mobile;

    /**
     * 用户头像
     */
    @TableId(value = "photo")
    private String photo;

    /**
     * 最后登陆IP
     */
    @TableId(value = "login_ip")
    private String loginIp;

    /**
     * 最后登陆时间
     */
    @TableId(value = "login_date")
    private String  loginDate;

    /**
     * 是否可登录
     */
    @TableId(value = "login_flag")
    private String loginFlag;

    /**
     * 创建者
     */
    @TableId(value = "create_by")
    private String  createBy;

    /**
     * 创建时间
     */
    @TableId(value = "create_date")
    private String  createDate;

    /**
     * 更新者
     */
    @TableId(value = "update_by")
    private String  updateBy;

    /**
     * 更新时间
     */
    @TableId(value = "update_date")
    private String  updateDate;

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