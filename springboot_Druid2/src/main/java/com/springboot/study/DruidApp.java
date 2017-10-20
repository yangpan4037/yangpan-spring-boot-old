package com.springboot.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * com.springboot.study.DruidApp: druid 应用类
 *
 * @author: MrServer
 * @since: 17/9/27 上午10:51
 */
@SpringBootApplication
public class DruidApp {

    public static void main(String[] args){
        SpringApplication.run(DruidApp.class,args);
    }

}
