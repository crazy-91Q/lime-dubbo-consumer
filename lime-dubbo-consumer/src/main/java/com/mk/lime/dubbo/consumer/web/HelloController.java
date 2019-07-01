package com.mk.lime.dubbo.consumer.web;

import com.mk.lime.HelloService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @Reference(version = "1.0")
    private HelloService helloService;


    @GetMapping
    public String hello(String name) {
        return helloService.sayHello(name);
    }
}
