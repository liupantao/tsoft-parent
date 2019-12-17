package com.tsoft.user.feign;

import com.tsoft.user.service.impl.UserService;
import org.springframework.stereotype.Component;

/**
 * @ClassName RemoteHystrix
 * @Description: TODO
 * @Author liupantao
 * @Date 2019/12/17
 * @Version V1.0
 **/

@Component
public class RemoteHystrix implements UserService {

    @Override
    public String getUserInfo(String name) {
        return "请求超时了";
    }
}