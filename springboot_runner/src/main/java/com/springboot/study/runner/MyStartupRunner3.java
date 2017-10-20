package com.springboot.study.runner;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * MyStartupRunner3:
 *
 * @author: MrServer
 * @since: 17/9/27 下午2:21
 */
@Component
public class MyStartupRunner3 implements ApplicationRunner {


    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("<<<<<<<<<<<<这个是测试ApplicationRunner接口>>>>>>>>>>>>>>");
    }
}
