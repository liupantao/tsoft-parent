package com.tsoft.user.security.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tsoft.user.security.entity.Menu;
import com.tsoft.user.security.entity.Role;

import java.util.List;

/**
 * @ClassName UserService
 * @Description: TODO
 * @Author liupantao
 * @Date 2019/12/24
 * @Version V1.0
 **/
public interface MenuService extends IService<Menu> {

   public  List<Menu> getAllMenuByRoleId(Integer id);
}
