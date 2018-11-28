package com.zw.servicehi.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {


    @Value("${server.port}")
    String port;


    @RequestMapping("/hi")
    public String home(@RequestParam("name") String name) {
        return "hi " + name + " ,i am from port:" + port;
    }

    @RequestMapping("/actuator/info")
    public String info() {
        return "我是"+port;
    }

}
