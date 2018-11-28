package com.zw.eurekaserver;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {
	//注册中心
	public static void main(String[] args) {
		SpringApplication.run(EurekaServerApplication.class, args);
	}

}
