package com.springboot.study.controller;

import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;

/**
 * PageController: @Controller @Service 等被Spring管理的类都支持，注意重写的方法 setEnvironment 是在系统启动的时候被执行。
 *
 * @author: MrServer
 * @since: 17/9/29 上午10:22
 */
@Controller
public class PageController implements EnvironmentAware {
    @Override
    public void setEnvironment(Environment environment) {
        String s = environment.getProperty("JAVA_HOME");
        System.out.println(s);
    }
}
