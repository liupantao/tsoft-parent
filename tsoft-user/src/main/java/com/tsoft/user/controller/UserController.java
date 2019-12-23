package com.tsoft.user.controller;

import cn.hutool.http.HttpUtil;
import com.tsoft.order.entity.OrdOrder;
import com.tsoft.user.feign.OrderFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName UserController
 * @Description: TODO
 * @Author liupantao
 * @Date 2019/12/17
 * @Version V1.0
 **/
@RestController
public class UserController {
    @Autowired
    OrderFeign orderFeign;

    @Value("${server.port}")
    private String port;

    @RequestMapping("/getOrderById")
    public OrdOrder getOrderById(){
        OrdOrder orderById = orderFeign.getOrderById("1");
        return  orderById;
    }

}
