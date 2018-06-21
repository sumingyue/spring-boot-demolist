package com.example.springbooteurekazuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@EnableZuulProxy
@EnableCircuitBreaker
@SpringBootApplication
public class SpringBootEurekaZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootEurekaZuulApplication.class, args);
	}

	@Bean
	public AccessFilter accessFilter(){
		return  new AccessFilter();
	}
}
