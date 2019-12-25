package com.tsoft.user.security.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tsoft.user.security.entity.Role;
import com.tsoft.user.security.entity.RoleMenu;
import com.tsoft.user.security.mapper.RoleMapper;
import com.tsoft.user.security.mapper.RoleMenuMapper;
import com.tsoft.user.security.service.RoleMenuService;
import com.tsoft.user.security.service.RoleService;
import org.springframework.stereotype.Service;

/**
 * @ClassName CtUserServiceImpl
 * @Description: TODO
 * @Author liupantao
 * @Date 2019/12/23
 * @Version V1.0
 **/
@Service
public class RoleMenuServiceImpl extends ServiceImpl<RoleMenuMapper, RoleMenu> implements RoleMenuService {
}
