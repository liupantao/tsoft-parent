package com.tsoft.user.security;

import com.tsoft.user.security.utils.MD5Util;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authc.credential.SimpleCredentialsMatcher;

/**
 * @ClassName CredentialsMatcher
 * @Description: 密码校验器
 * @Author liupantao
 * @Date 2019/12/24
 * @Version V1.0
 **/
@Slf4j
public class CredentialsMatcher extends SimpleCredentialsMatcher {
    @Override
    public boolean doCredentialsMatch(AuthenticationToken token, AuthenticationInfo info) {
        log.info("----执行密码比较器----");
        UsernamePasswordToken utoken = (UsernamePasswordToken) token;
        // 获得用户输入的密码:(可以采用加盐(salt)的方式去检验)
        String inPassword = new String(utoken.getPassword());
        // 获得数据库中的密码
        String dbPassword = (String) info.getCredentials();
        // 进行密码的比对
        return this.equals(MD5Util.encrypt(inPassword), dbPassword);
    }

}
