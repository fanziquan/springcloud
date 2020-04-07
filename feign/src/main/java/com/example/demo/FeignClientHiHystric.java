package com.example.demo;

import org.springframework.stereotype.Component;

/**
 * @author fanzq22858
 * @version $Id: FeignClientHiHystric.java, v 0.1 2018/7/19 11:28 Exp $
 */
@Component
public class FeignClientHiHystric implements FeignClientHi{

    @Override
    public String sayHiFromClientOne() {
        return "sorry";
    }
}
