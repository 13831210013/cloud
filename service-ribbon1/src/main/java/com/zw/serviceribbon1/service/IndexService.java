package com.zw.serviceribbon1.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service

public class IndexService {

    @Autowired
    RestTemplate restTemplate;

    //断路器
    @HystrixCommand(fallbackMethod = "hiError")
    public String hiService(String name) {
        return restTemplate.getForObject("http://SERVICE-HI/hi?name="+name,String.class);
    }

    //断路器熔断指定方法
    public String hiError(String name) {
        return "hi,"+name+",sorry,error!";
    }


}
