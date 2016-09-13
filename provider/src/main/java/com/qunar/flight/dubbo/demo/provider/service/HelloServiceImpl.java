package com.qunar.flight.dubbo.demo.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.qunar.flight.api.HelloService;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * since 2016/9/9.
 */
@Service(group = "hello1")
public class HelloServiceImpl implements HelloService {
    @Override
    public String hello(String name) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-DD hh:mm:ss");
        return "hello " + name + " "+ format.format(new Date());
    }
}
