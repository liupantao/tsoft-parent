package com.tsoft.user.feign;

import com.tsoft.order.entity.OrdOrder;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @ClassName EchoServiceFallback
 * @Description: TODO
 * @Author liupantao
 * @Date 2019/12/17
 * @Version V1.0
 **/
public class EchoServiceFallback implements OrderFeign {

    @Override
    public OrdOrder getOrderById(@RequestParam(name="id") String id){
        OrdOrder order= new OrdOrder();
        order.setOrderDes("service  not found ...");
        return order;
    }
}
