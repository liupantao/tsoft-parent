package com.tsoft.user.feign;

import com.tsoft.order.service.OrderService;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "service-order")
public interface OrderFeign extends OrderService {
}
