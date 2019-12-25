package com.tsoft.user.security.realm;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.CollectionUtils;
import com.tsoft.user.security.entity.Menu;
import com.tsoft.user.security.entity.Role;
import com.tsoft.user.security.entity.User;
import com.tsoft.user.security.entity.UserRole;
import com.tsoft.user.security.service.MenuService;
import com.tsoft.user.security.service.RoleService;
import com.tsoft.user.security.service.UserRoleService;
import com.tsoft.user.security.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @ClassName ShiroRealm
 * @Description: TODO
 * @Author liupantao
 * @Date 2019/12/24
 * @Version V1.0
 **/
@Slf4j
public class ShiroRealm extends AuthorizingRealm {

    @Autowired
    private UserService userService;
    @Autowired
    private RoleService roleService;
    @Autowired
    private MenuService menuService;

    @Autowired
    private UserRoleService userRoleService;
    /**
     * 认证信息.(身份验证) : Authentication 是用来验证用户身份
     *
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authcToken) throws AuthenticationException {
        log.info("---------------- 执行 ShiroRealm 凭证认证 ----------------------");
        UsernamePasswordToken token = (UsernamePasswordToken) authcToken;
        String name = token.getUsername();
        // 从数据库获取对应用户名密码的用户
        QueryWrapper<User> queryWrapper= new QueryWrapper<>();
        queryWrapper.ge("name",name);
        User user = userService.getOne(queryWrapper);
        if (user != null) {
            // 用户为禁用状态
            if (!user.getLoginFlag().equals("1")) {
                throw new DisabledAccountException();
            }
            log.info("---------------- Shiro 凭证认证成功 ----------------------");
            SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(
                    user, //用户
                    user.getPassword(), //密码
                    getName()  //realm name
            );
            return authenticationInfo;
        }
        throw new UnknownAccountException();
    }

    /**
     * 授权
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        log.info("---------------- 执行 Shiro 权限获取 ---------------------");
        Object principal = principals.getPrimaryPrincipal();
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        if (principal instanceof User) {
            User userLogin = (User) principal;
            if(userLogin != null){
                //List<Role> roleList = roleService.findByUserid(userLogin.getId());
                QueryWrapper<UserRole> queryWrapper= new QueryWrapper<>();
                queryWrapper.ge("user_id",userLogin.getId());
                /*List<UserRole> one = userRoleService.list(queryWrapper);
                if(one==null){
                    return info;
                }*/
                List<Role> roleList = roleService.findAll();
                //java.util.List<Role> roleList = roleService.list(queryWrapper);
                if(CollectionUtils.isNotEmpty(roleList)){
                    for(Role role : roleList){
                        info.addRole(role.getEnname());
                        QueryWrapper<Menu> qw= new QueryWrapper<>();
                        qw.ge("role_id",role.getId());
                        List<Menu>   menuList =  menuService.list(qw);
                        if(CollectionUtils.isNotEmpty(menuList)){
                            for (Menu menu : menuList){
                                if(StringUtils.isNoneBlank(menu.getPermission())){
                                    info.addStringPermission(menu.getPermission());
                                }
                            }
                        }
                    }
                }
            }
        }
        log.info("---------------- 获取到以下权限 ----------------");
        log.info(info.getStringPermissions().toString());
        log.info("---------------- Shiro 权限获取成功 ----------------------");
        return info;
    }


}
