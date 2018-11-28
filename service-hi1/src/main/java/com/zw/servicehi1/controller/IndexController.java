package com.zw.servicehi1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.logging.Level;
import java.util.logging.Logger;

@RestController
public class IndexController {

    private static final Logger LOG = Logger.getLogger(IndexController.class.getName());


    @Value("${server.port}")
    private String port;

    @Autowired
    private RestTemplate restTemplate;

//    @RequestMapping("/hi")
//    public String home(@RequestParam("name") String name) {
//        return "hi " + name + " ,i am from port:" + port;
//    }

    @RequestMapping("/hi")
    public String callHome(){
        LOG.log(Level.INFO, "calling trace service-hi1 ");
        return restTemplate.getForObject("http://localhost:8989/miya", String.class);
    }


    @RequestMapping("/info")
    public String info(){
        LOG.log(Level.INFO, "calling trace service-hi1 ");
        return "i'm service-hi1";
    }

}
