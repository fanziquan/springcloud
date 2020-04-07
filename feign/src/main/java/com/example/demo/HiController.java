package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fanzq22858
 * @version $Id: HiController.java, v 0.1 2018/7/18 17:20 Exp $
 */
@RestController
public class HiController {

    @Autowired
    FeignClientHi feignClientHi;

    @GetMapping(value = "/hi")
    public String sayHi(){
        return feignClientHi.sayHiFromClientOne();
    }
}
