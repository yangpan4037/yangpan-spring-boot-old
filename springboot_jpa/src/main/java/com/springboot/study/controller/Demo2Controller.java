package com.springboot.study.controller;

import com.springboot.study.entity.Demo;
import com.springboot.study.service.DemoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Demo2Controller: 测试
 *
 * @author: MrServer
 * @since: 17/9/26 下午6:17
 */
@RestController
public class Demo2Controller {


    @Resource
    private DemoService demoService;

    /**
     * 测试保存数据方法.
     *
     * @return
     */
    @GetMapping("/save")
    public String save() {
        Demo d = new Demo();
        d.setName("Angel1111");
        demoService.save(d);//保存数据.
        return "ok.Demo2Controller.save";
    }


}
