package com.example.demo.service.impl;

import com.example.demo.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author fanzq22858
 * @version $Id: HelloServiceImpl.java, v 0.1 2018/7/18 16:46 Exp $
 */
@Service
public class HelloServiceImpl implements HelloService {

    @Autowired
    RestTemplate restTemplate;

    @Override
    public String hiService() {
        return restTemplate.getForObject("http://EUREKA-CLIENT/client",String.class);
    }

    @Override
    public String hiError() {
        return "hi,sorry,error!";
    }

}
