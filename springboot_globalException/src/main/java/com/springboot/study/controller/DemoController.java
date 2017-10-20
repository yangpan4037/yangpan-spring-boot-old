package com.springboot.study.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * DemoController: 测试控制类
 *
 * @author: MrServer
 * @since: 17/9/26 下午5:28
 */
@RestController
public class DemoController {


    @GetMapping("/zeroException")
    public int zeroException(){
        return 100/0;
    }

}
