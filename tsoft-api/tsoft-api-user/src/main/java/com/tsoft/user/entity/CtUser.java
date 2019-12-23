package com.tsoft.user.entity;

/**
 * @ClassName CtUser
 * @Description: TODO
 * @Author liupantao
 * @Date 2019/12/23
 * @Version V1.0
 **/

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * <p>
 *
 * </p>
 *
 * @author Pandong
 * @since 2019-03-05
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("ct_user")
public class CtUser extends Model<CtUser> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "user_id", type = IdType.AUTO)
    private Long userId;

    /**
     * 用户名称
     */
    @TableField("user_name")
    private String userName;

    /**
     * 年龄
     */
    private Integer age;



    @Override
    protected Serializable pkVal() {
        return this.userId;
    }

}