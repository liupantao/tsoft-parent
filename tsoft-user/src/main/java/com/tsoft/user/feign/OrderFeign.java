package com.tsoft.user.feign;

import com.tsoft.order.service.OrderService;
import com.tsoft.user.service.impl.UserService;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "service-order", fallback = EchoServiceFallback.class, configuration = FeignConfiguration.class)
public interface OrderFeign extends OrderService {
}
