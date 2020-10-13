package com.okc.service.impl;

import com.okc.service.HelloService;
import org.springframework.stereotype.Service;

/**
 * @author TonyLeung
 * @date 2020/10/13
 */
@Service
public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHelloFromClientOne(String name) {
        return "故障了: " + name;
    }
}
