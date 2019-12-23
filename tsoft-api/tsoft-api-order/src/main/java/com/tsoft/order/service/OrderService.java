package com.tsoft.order.service;

import com.tsoft.order.entity.OrdOrder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

public interface OrderService {

    @PostMapping("getOrderById")
    public OrdOrder getOrderById(@RequestParam(name="id") String id);
}
