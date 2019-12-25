package com.tsoft.user.security.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tsoft.user.security.entity.Role;
import com.tsoft.user.security.entity.User;
import com.tsoft.user.security.mapper.RoleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import  java.util.*;

/**
 * @ClassName UserService
 * @Description: TODO
 * @Author liupantao
 * @Date 2019/12/24
 * @Version V1.0
 **/
public interface RoleService extends IService<Role> {

   List<Role> findAll();

   public List<Role> findByUserid(Integer id);
}
