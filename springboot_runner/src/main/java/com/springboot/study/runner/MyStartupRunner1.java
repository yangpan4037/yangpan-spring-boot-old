package com.springboot.study.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * MyStartupRunner1:  服务启动执行
 *
 * @author: MrServer
 * @since: 17/9/27 下午2:12
 */
@Component
@Order(value=2)
public class MyStartupRunner1 implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        System.out.println(">>>>>>>>>>>>>>>服务启动执行，执行加载数据等操作11111<<<<<<<<<<<<<");
    }

}
