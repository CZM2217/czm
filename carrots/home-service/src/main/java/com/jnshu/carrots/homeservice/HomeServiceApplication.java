package com.jnshu.carrots.homeservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableDiscoveryClient
@EnableEurekaClient
@MapperScan("com.jnshu.carrots.homeservice.dao")
public class HomeServiceApplication {



	public static void main(String[] args) {

		SpringApplication.run(HomeServiceApplication.class, args);

	}


}
