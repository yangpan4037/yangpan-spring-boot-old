package com.springboot.study;

import com.springboot.study.config.Wisely2Settings;
import com.springboot.study.config.WiselySettings;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * DemoApplication:
 *
 * @author: MrServer
 * @since: 17/9/29 上午10:43
 */
@SpringBootApplication
@EnableConfigurationProperties({WiselySettings.class, Wisely2Settings.class})
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
