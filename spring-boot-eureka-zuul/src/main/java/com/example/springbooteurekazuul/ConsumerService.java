package com.example.springbooteurekazuul;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

public class ConsumerService {


    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "fallback")
    public String consumer() {
        return restTemplate.getForObject("http://127.0.0.1:1003/hello?name=1&accessToken=33", String.class);
    }

    public String fallback() {
        return "fallback";
    }
}
