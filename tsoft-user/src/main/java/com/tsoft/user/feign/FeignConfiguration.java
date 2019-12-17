package com.tsoft.user.feign;

import org.springframework.context.annotation.Bean;

/**
 * @ClassName FeignConfiguration
 * @Description: TODO
 * @Author liupantao
 * @Date 2019/12/17
 * @Version V1.0
 **/
public class FeignConfiguration {
    @Bean
    public EchoServiceFallback echoServiceFallback() {
        return new EchoServiceFallback();
    }
}
