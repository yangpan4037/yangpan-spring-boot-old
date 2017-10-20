package com.springboot.study;

import com.springboot.study.utils.SpringUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;

/**
 * BeanApp: bean启动类
 *
 * @author: MrServer
 * @since: 17/9/27 上午11:10
 */
@SpringBootApplication
@Import(value={SpringUtil.class})
public class BeanApp {




//    /**
//     * 注册Spring Util
//     * 这里为了和上一个冲突，所以方面名为：springUtil2
//     * 实际中使用springUtil
//     */
//    @Bean
//    public SpringUtil springUtil2(){return new SpringUtil();}


    public static void main(String[] args){
        SpringApplication.run(BeanApp.class,args);
    }

}
