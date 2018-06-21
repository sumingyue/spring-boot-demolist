package com.example.springbooteurekaproduce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableDiscoveryClient
@SpringBootApplication
public class SpringBootEurekaProduceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootEurekaProduceApplication.class, args);
	}

	/** 获取端口号 */
	String port="1003";

	/**
	 * 定义一个简单接口
	 * @param name
	 * @return
	 */
	@GetMapping("/hi/{name}")
	public String home(@PathVariable String name){
		return "hi " + name + ",I am from port :" + port;
	}
	/**
	 * 定义一个简单接口
	 * @param name
	 * @return
	 */
	@GetMapping("/hello")
	public String hello(String name,String accessToken){
		return "hello:name="+name+";accessToken="+accessToken;
	}
}
