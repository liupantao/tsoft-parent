package com.tsoft.user.security.filter;

import com.tsoft.user.security.realm.LoginType;
import com.tsoft.user.security.realm.UserToken;
import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;
import org.springframework.stereotype.Component;

import javax.servlet.Servlet;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * @ClassName MyFormAuthenticationFilter
 * @Description: TODO
 * @Author liupantao
 * @Date 2019/12/25
 * @Version V1.0
 **/

public class MyFormAuthenticationFilter extends FormAuthenticationFilter

{
    @Override
   public UserToken createToken(ServletRequest request, ServletResponse response) {

        String username = getUsername(request);
        String password = getPassword(request);
        String loginType = request.getParameter("loginType");
        if(LoginType.WECHAT_LOGIN.getType().equals(loginType)){
            return new UserToken(LoginType.WECHAT_LOGIN,username, password);
        } else {
            return new UserToken(LoginType.USER_PASSWORD,username, password, "wx");
        }


   }


}
