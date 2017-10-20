package com.springboot.study.service;

import com.springboot.study.dao.DemoRepository;
import com.springboot.study.entity.Demo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * DemoService: Demo测试业务类
 *
 * @author: MrServer
 * @since: 17/9/26 下午5:46
 */
@Service
public class DemoService {

    @Resource
    private DemoRepository demoRepository;



    public void save(Demo demo){
        demoRepository.save(demo);
    }



}
