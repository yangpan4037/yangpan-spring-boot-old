package com.springboot.study.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;

/**
 * GlobalDefaultExceptionHandler: 全局异常捕获
 *
 * @author: MrServer
 * @since: 17/9/26 下午5:26
 */
@ControllerAdvice
public class GlobalDefaultExceptionHandler {


    @ExceptionHandler(value = Exception.class)
    public void defaultErrorHandler(HttpServletRequest req, Exception e) {
        //打印异常信息：
        e.printStackTrace();
        System.out.println("我捕获到了全局异常信息===GlobalDefaultExceptionHandler.defaultErrorHandler()");


        /*
        * 返回json数据或者String数据：
        * 那么需要在方法上加上注解：@ResponseBody
        * 添加return即可。
        */

       /*
        * 返回视图：
        * 定义一个ModelAndView即可，
        * 然后return;
        * 定义视图文件(比如：error.html,error.ftl,error.jsp);
        *
        */


    }
}
