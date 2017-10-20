package com.springboot.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * DruidApp: druid 应用类
 *
 * @author: MrServer
 * @since: 17/9/27 上午10:51
 */
@SpringBootApplication
@ServletComponentScan //spring能够扫描到我们自己编写的servlet和filter
public class DruidApp {

    public static void main(String[] args){
        SpringApplication.run(DruidApp.class,args);
    }

}
