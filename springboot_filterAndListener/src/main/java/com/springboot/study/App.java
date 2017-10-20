package com.springboot.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * App:
 *
 * @author: MrServer
 * @since: 17/9/27 上午11:47
 */
@SpringBootApplication
@ServletComponentScan
public class App {

    public static void main(String[] args){
        SpringApplication.run(App.class,args);
    }

}
