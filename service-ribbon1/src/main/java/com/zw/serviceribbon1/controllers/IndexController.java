package com.zw.serviceribbon1.controllers;

import com.zw.serviceribbon1.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @Autowired
    IndexService indexService;

    @GetMapping(value = "/hi")
    public String hi(@RequestParam String name) {
        return indexService.hiService(name);
    }


}
