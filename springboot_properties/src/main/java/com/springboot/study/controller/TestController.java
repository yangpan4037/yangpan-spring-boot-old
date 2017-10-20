package com.springboot.study.controller;

import com.springboot.study.config.Wisely2Settings;
import com.springboot.study.config.WiselySettings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TestController:
 *
 * @author: MrServer
 * @since: 17/9/29 上午10:44
 */
@RestController
public class TestController {

    @Autowired
    WiselySettings wiselySettings;
    @Autowired
    Wisely2Settings wisely2Settings;

    @GetMapping("/test")
    public String test() {
        System.out.println(wiselySettings.getGender() + "---" + wiselySettings.getName());
        System.out.println(wisely2Settings.getGender() + "===" + wisely2Settings.getGender());
        return "ok";
    }
}
