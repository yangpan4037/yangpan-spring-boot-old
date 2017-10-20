package com.springboot.study.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * MyServletContextListener: 使用@WebListener注解，实现ServletContextListener接口
 *
 * @author: MrServer
 * @since: 17/9/27 上午11:45
 */
@WebListener
public class MyServletContextListener  implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println("ServletContex初始化");
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.out.println("ServletContex销毁");
    }
}
