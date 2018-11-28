package com.zw.servicemiya.controllers;

import com.zw.servicemiya.ServiceMiyaApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.logging.Level;
import java.util.logging.Logger;

@RestController
public class IndexController {

    private static final Logger LOG = Logger.getLogger(ServiceMiyaApplication.class.getName());

    @Autowired
    private RestTemplate restTemplate;


    @RequestMapping("/hi") public String home(){
        LOG.log(Level.INFO, "hi is being called");
        return "hi i'm miya!";
    }

    @RequestMapping("/miya")
    public String info(){
        LOG.log(Level.INFO, "info is being called");
        return restTemplate.getForObject("http://localhost:8762/info",String.class);
    }


}
