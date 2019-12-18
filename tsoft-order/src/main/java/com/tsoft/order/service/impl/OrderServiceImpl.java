package com.tsoft.order.service.impl;

import com.tsoft.order.api.OrdOrder;
import com.tsoft.order.service.OrderService;
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

    @Override
    public OrdOrder getOrderById(String id) {
        OrdOrder order=new OrdOrder();
        order.setId(id);
        order.setOrderCode(id+"--code--");
        order.setOrderDes("你好");
        return order;
    }
}
