package com.tsoft.user.service.impl;

import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName UserSericeImpl
 * @Description: TODO
 * @Author liupantao
 * @Date 2019/12/17
 * @Version V1.0
 **/
//@RestController
public class UserServiceImpl implements  UserService {

    @Override
    public String getUserInfo(String name) {
        return name;
    }
}
