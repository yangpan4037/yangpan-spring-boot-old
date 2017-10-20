package com.springboot.study.controller;

import com.springboot.study.bean.Shanhy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * HelloController:
 *
 * @author: MrServer
 * @since: 17/9/29 下午2:05
 */
@RestController
public class HelloController {

    @Resource(name = "shanhyA")
    private Shanhy shanhyA;

    @Autowired
    @Qualifier("shanhyB")
    private Shanhy shanhyB;

    @RequestMapping("/test")
    public String test(){
        shanhyA.display();
        shanhyB.display();
        return"test";
    }


}
