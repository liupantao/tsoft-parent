package com.tsoft.user.security.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tsoft.user.security.entity.Menu;
import com.tsoft.user.security.entity.Role;
import com.tsoft.user.security.mapper.MenuMapper;
import com.tsoft.user.security.mapper.RoleMapper;
import com.tsoft.user.security.service.MenuService;
import com.tsoft.user.security.service.RoleService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName CtUserServiceImpl
 * @Description: TODO
 * @Author liupantao
 * @Date 2019/12/23
 * @Version V1.0
 **/
@Service
public class MenuServiceImpl extends ServiceImpl<MenuMapper, Menu> implements MenuService {
    @Override
    public List<Menu> getAllMenuByRoleId(Integer id) {
        return null;
    }
}
