package com.example.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author fanzq22858
 * @version $Id: FeignClientHi.java, v 0.1 2018/7/18 17:16 Exp $
 */
@FeignClient(value = "eureka-client", fallback = FeignClientHiHystric.class)
public interface FeignClientHi {

    @RequestMapping(value = "/client",method = RequestMethod.GET)
    String sayHiFromClientOne();
}
