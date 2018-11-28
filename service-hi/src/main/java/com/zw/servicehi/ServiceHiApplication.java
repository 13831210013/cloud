package com.zw.servicehi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ServiceHiApplication {
	//服务提供方 1
	public static void main(String[] args) {
		SpringApplication.run(ServiceHiApplication.class, args);
	}
}
