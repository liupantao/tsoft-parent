package com.tsoft.user.security.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tsoft.user.security.entity.Role;
import com.tsoft.user.security.entity.User;
import com.tsoft.user.security.mapper.RoleMapper;
import com.tsoft.user.security.mapper.UserMapper;
import com.tsoft.user.security.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
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
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements RoleService {

    @Autowired
    private  RoleMapper roleMapper;

    @Override
    public List<Role> findAll(){
        List<Role> all = roleMapper.findAll();
        return all;
    }

    @Override
    public List<Role> findByUserid(Integer id) {
        return null;
    }


}
