package com.tsoft.user.security.conttroller;

import com.tsoft.user.security.entity.User;
import com.tsoft.user.security.service.UserService;
import com.tsoft.user.security.vo.Grid;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName UserController
 * @Description: TODO
 * @Author liupantao
 * @Date 2019/12/24
 * @Version V1.0
 **/
@RestController
@RequestMapping("/admin/user")
public class SysUserController {

    @Autowired
    private UserService userService;

    @RequiresPermissions("sys:user:view")
    @RequestMapping("findList")
    public List<User> findList(){
        return null;
    }
    @RequestMapping("findList2")
    public List<User> findList2(){
        return null;
    }

}
