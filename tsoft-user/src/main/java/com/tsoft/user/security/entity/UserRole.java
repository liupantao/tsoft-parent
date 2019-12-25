package com.tsoft.user.security.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @ClassName UserRole
 * @Description: TODO
 * @Author liupantao
 * @Date 2019/12/24
 * @Version V1.0
 **/
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("sys_user_role")
public class UserRole implements Serializable{

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "user_id")
    private Integer userId;

    /**
         * 角色编号
         */
    @TableId(value = "role_id")
    private Integer roleId;

}