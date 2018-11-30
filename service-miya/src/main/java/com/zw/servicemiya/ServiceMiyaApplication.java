package com.zw.servicemiya;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//服务追踪分析需要暴露的接口
//在spring Cloud为F版本的时候，已经不需要自己构建Zipkin Server了，只需要下载jar即可，下载地址：
//https://dl.bintray.com/openzipkin/maven/io/zipkin/java/zipkin-server/
//下载完成jar 包之后，需要运行jar，如下： java -jar zipkin-server-2.10.1-exec.jar
//访问浏览器localhost:9494
@SpringBootApplication
public class ServiceMiyaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceMiyaApplication.class, args);
	}
}
