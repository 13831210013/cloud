package com.zw.serviceribbon1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;



@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@EnableHystrix //断路器
public class ServiceRibbon1Application {

	/**    断路器
	 * 在微服务架构中，根据业务来拆分成一个个的服务，
	 * 服务与服务之间可以相互调用（RPC），在Spring Cloud可以用RestTemplate+Ribbon和Feign来调用。
	 * 为了保证其高可用，单个服务通常会集群部署。由于网络原因或者自身的原因，服务并不能保证100%可用，
	 * 如果单个服务出现问题，调用这个服务就会出现线程阻塞，此时若有大量的请求涌入，
	 * Servlet容器的线程资源会被消耗完毕，导致服务瘫痪。服务与服务之间的依赖性，故障会传播，
	 * 会对整个微服务系统造成灾难性的严重后果，这就是服务故障的“雪崩”效应。
	 * 为了解决这个问题，业界提出了断路器模型。
	 */

	//负载均衡   第一种
	public static void main(String[] args) {
		SpringApplication.run(ServiceRibbon1Application.class, args);
	}

	@Bean
	@LoadBalanced
	RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
