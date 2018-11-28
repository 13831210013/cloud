package com.zw.servicehi1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ServiceHi1Application {
	//服务提供方2
	public static void main(String[] args) {
		SpringApplication.run(ServiceHi1Application.class, args);
	}




}
