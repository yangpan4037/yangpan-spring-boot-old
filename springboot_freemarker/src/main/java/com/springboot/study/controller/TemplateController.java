package com.springboot.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * TemplateController:
 *
 * @author: MrServer
 * @since: 17/9/27 上午11:30
 */
@Controller
public class TemplateController {

    @GetMapping("/helloFtl")
    public String helloFtl(Map<String,Object> map){
        map.put("hello","from TemplateController.helloFtl");
        return"/helloFtl";
    }

}
