package com.tsoft.user.security.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tsoft.user.security.entity.User;
import com.tsoft.user.security.entity.UserRole;
import com.tsoft.user.security.mapper.UserMapper;
import com.tsoft.user.security.mapper.UserRoleMapper;
import com.tsoft.user.security.service.UserRoleService;
import com.tsoft.user.security.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @ClassName CtUserServiceImpl
 * @Description: TODO
 * @Author liupantao
 * @Date 2019/12/23
 * @Version V1.0
 **/
@Service
public class UserRoleServiceImpl extends ServiceImpl<UserRoleMapper, UserRole> implements UserRoleService {
}
