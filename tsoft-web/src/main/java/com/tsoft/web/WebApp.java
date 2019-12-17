package com.tsoft.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/**
 * @ClassName WebApp
 * @Description: TODO
 * @Author liupantao
 * @Date 2019/12/16
 * @Version V1.0
 **/
@EnableDiscoveryClient
@SpringBootApplication
public class WebApp {
    public static void main(String[] args) {
        SpringApplication.run(WebApp.class,args);
    }



    @RestController
    class EchoController {

        @GetMapping(value = "/")
        public ResponseEntity index() {
            return new ResponseEntity("index error", HttpStatus.INTERNAL_SERVER_ERROR);
        }

        @GetMapping(value = "/test")
        public ResponseEntity test() {
            return new ResponseEntity("error", HttpStatus.INTERNAL_SERVER_ERROR);
        }

        @GetMapping(value = "/sleep")
        public String sleep() {
            try {
                Thread.sleep(1000L);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "ok";
        }

        @GetMapping(value = "/echo/{string}")
        public String echo(@PathVariable String string) {
            return "hello Nacos Discovery " + string;
        }

        @GetMapping(value = "/divide")
        public String divide(@RequestParam Integer a, @RequestParam Integer b) {
            return String.valueOf(a / b);
        }
    }


}

