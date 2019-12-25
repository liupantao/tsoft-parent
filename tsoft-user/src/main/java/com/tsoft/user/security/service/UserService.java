package com.tsoft.user.security.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tsoft.user.security.entity.User;

/**
 * @ClassName UserService
 * @Description: TODO
 * @Author liupantao
 * @Date 2019/12/24
 * @Version V1.0
 **/
public interface UserService extends IService<User> {

   public  User getUserByName(String name);

    User getByPhone(String phone);

    User getByOpenid(String openid);
}
