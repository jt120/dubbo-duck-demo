package com.qunar.flight.dubbo.demo.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.qunar.flight.api.HelloService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * since 2016/9/9.
 */
@Controller
public class HelloAction {

    @Reference
    private HelloService helloService;


    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        return helloService.hello("action");
    }
}
