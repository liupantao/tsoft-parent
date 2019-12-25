package com.tsoft.user.security.conttroller;

/**
 * @ClassName LoginController
 * @Description: TODO
 * @Author liupantao
 * @Date 2019/12/24
 * @Version V1.0
 **/

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.tsoft.user.security.emum.ResultStatusCode;
import com.tsoft.user.security.realm.LoginType;
import com.tsoft.user.security.realm.UserToken;
import com.tsoft.user.security.vo.ResultMessage;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/admin")
public class LoginController {

    @RequestMapping("/login")
    public ResultMessage login(String loginName, String pwd){
        try {

            //UsernamePasswordToken token = new UsernamePasswordToken(loginName, pwd);
            UserToken token= new UserToken(LoginType.USER_PASSWORD,loginName,pwd);
            //登录不在该处处理，交由shiro处理
            Subject subject = SecurityUtils.getSubject();
            subject.login(token);

            if (subject.isAuthenticated()) {
                JSON json = new JSONObject();
                ((JSONObject) json).put("token", subject.getSession().getId());

                return new ResultMessage(ResultStatusCode.OK, json);
            }else{
                return new ResultMessage(ResultStatusCode.SHIRO_ERROR);
            }
        }catch (IncorrectCredentialsException | UnknownAccountException e){
            return new ResultMessage(ResultStatusCode.NOT_EXIST_USER_OR_ERROR_PWD);
        }catch (LockedAccountException e){
            return new ResultMessage(ResultStatusCode.USER_FROZEN);
        }catch (Exception e){
            log.info("error--"+e);
            return new ResultMessage(ResultStatusCode.SYSTEM_ERR);
        }
    }

    /**
     * 退出登录
     * @return
     */
    @RequestMapping("/logout")
    public ResultMessage logout(){
        SecurityUtils.getSubject().logout();
        return new ResultMessage(ResultStatusCode.OK);
    }
}
