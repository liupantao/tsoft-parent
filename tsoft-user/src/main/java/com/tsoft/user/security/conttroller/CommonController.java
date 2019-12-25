package com.tsoft.user.security.conttroller;

import cn.hutool.extra.tokenizer.Result;
import com.tsoft.user.security.emum.ResultStatusCode;
import com.tsoft.user.security.vo.ResultMessage;
import org.apache.shiro.SecurityUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName CommonController
 * @Description: TODO
 * @Author liupantao
 * @Date 2019/12/24
 * @Version V1.0
 **/


@RequestMapping("/common")
@RestController
public class CommonController {

    /**
     * 未授权跳转方法
     * @return
     */
    @RequestMapping("/unauth")
    public ResultMessage unauth(){
        SecurityUtils.getSubject().logout();
        return new ResultMessage(ResultStatusCode.UNAUTHO_ERROR);
    }

    /**
     * 被踢出后跳转方法
     * @return
     */
    @RequestMapping("/kickout")
    public ResultMessage kickout(){
        return new ResultMessage(ResultStatusCode.INVALID_TOKEN);
    }

}
