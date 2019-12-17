package com.tsoft.user.controller;

import com.tsoft.order.api.OrdOrder;
import com.tsoft.user.feign.OrderFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @RequestMapping("/getOrderById")
    public OrdOrder getOrderById(){
        OrdOrder orderById = orderFeign.getOrderById("1");
        return  orderById;
    }
}
