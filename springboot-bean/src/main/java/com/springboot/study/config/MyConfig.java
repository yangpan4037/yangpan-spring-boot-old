package com.springboot.study.config;

import com.springboot.study.bean.Shanhy;
import com.springboot.study.service.HelloService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * MyConfig:
 *
 * @author: MrServer
 * @since: 17/9/29 下午2:09
 */
@Configuration
public class MyConfig {
    @Bean(name="testHelloService")
    public HelloService filterRegistrationBean(@Qualifier("shanhyB") Shanhy shanhy){
        HelloService helloService = new HelloService();
        shanhy.display();
        // 其它处理代码.
        return helloService;
    }

}
