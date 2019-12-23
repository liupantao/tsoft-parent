package com.tsoft.order.service.impl;

import com.tsoft.order.entity.OrdOrder;
import com.tsoft.order.service.OrderService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName OrderServiceImpl
 * @Description: TODO
 * @Author liupantao
 * @Date 2019/12/17
 * @Version V1.0
 **/
@RestController
public class OrderServiceImpl implements OrderService {
    @Value("${server.port}")
    private String port;

    @Override
    public OrdOrder getOrderById(String id) {
        OrdOrder order=new OrdOrder();
        order.setId(id);
        order.setOrderCode(id+"--code--");
        order.setOrderDes("端口="+port);
        return order;
    }
}
