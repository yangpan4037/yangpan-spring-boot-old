package com.springboot.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

/**
 * TemplateController: 测试
 *
 * @author: MrServer
 * @since: 17/9/27 上午11:24
 */
@Controller
public class TemplateController {


    @GetMapping("/helloHtml")
    public String helloHtml(Map<String,Object> map){
        map.put("hello","from TemplateController.helloHtml");
        return"/helloHtml";
    }


}
