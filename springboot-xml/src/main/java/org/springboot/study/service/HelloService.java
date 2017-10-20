package org.springboot.study.service;

import org.springframework.stereotype.Service;

/**
 * HelloService:
 *
 * @author: MrServer
 * @since: 17/9/29 上午11:01
 */
@Service
public class HelloService {

    public HelloService() {
        System.out.println("HelloService.HelloService()");
        System.out.println("org.springboot.study.service.HelloService.HelloService()");
        System.out.println("HelloService.HelloService()");
    }

}
