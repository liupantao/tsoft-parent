package com.tsoft.user.security.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tsoft.user.security.entity.User;
import com.tsoft.user.security.mapper.UserMapper;
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
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
    @Override
    public User getUserByName(String name) {
        QueryWrapper<User> queryWrapper= new QueryWrapper<>();
        queryWrapper.ge("login_name",name);
        User one = this.getOne(queryWrapper);
        return one;
    }

    @Override
    public User getByPhone(String phone) {
        return null;
    }

    @Override
    public User getByOpenid(String openid) {
        return null;
    }
}
