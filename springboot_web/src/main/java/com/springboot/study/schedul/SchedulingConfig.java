package com.springboot.study.schedul;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * SchedulingConfig: 定时任务调度类
 *
 * @author: MrServer
 * @since: 17/9/27 上午10:30
 */

@Configuration
@EnableScheduling
public class SchedulingConfig {


    @Scheduled(cron = "0/2 * * * * ?") // 每2秒执行一次
    public void scheduler() {
        System.out.println(">>>>>>>>> SchedulingConfig.scheduler()");
    }

}
