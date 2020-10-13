package com.okc.service;

import com.okc.service.impl.HelloServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author TonyLeung
 * @date 2020/10/13
 */
@FeignClient(value = "service-hello", fallback = HelloServiceImpl.class)
public interface HelloService {

    @GetMapping("/hello")
    String sayHelloFromClientOne(@RequestParam(value = "name") String name);


}
