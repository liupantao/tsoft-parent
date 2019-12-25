package com.tsoft.user.security.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.tsoft.user.security.entity.Role;
import com.tsoft.user.security.entity.UserRole;
import org.apache.ibatis.annotations.Mapper;

/**
 * @ClassName CtUserMapper
 * @Description: TODO
 * @Author liupantao
 * @Date 2019/12/23
 * @Version V1.0
 **/
@Mapper
public interface UserRoleMapper extends BaseMapper<UserRole> {

}
