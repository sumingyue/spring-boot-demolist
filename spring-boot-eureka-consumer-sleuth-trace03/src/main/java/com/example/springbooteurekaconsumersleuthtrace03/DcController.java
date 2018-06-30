package com.example.springbooteurekaconsumersleuthtrace03;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletRequest;

@RestController
public class DcController {

    private final static Logger logger = LoggerFactory.getLogger(DcController.class);

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(name = "/consumer",method = RequestMethod.GET)
    public String dc(HttpServletRequest request) {
        logger.info("=================call client hi traceId={},spanId={},parentSpanId={},span-Name={}",
                request.getHeader("X-B3-TraceId"),
                request.getHeader("X-B3-SpanId"),
                request.getHeader("X-B3-ParentSpanId"),
                request.getHeader("X-Span-Name"));
        return restTemplate.getForObject("http://sleuth-trace02/consumer", String.class);
    }
}
