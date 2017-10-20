package com.springboot.study.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * MongoAutoConfiguration: 通过@ConfigurationProperties 读取application属性配置文件中的属性。
 *
 * @author: MrServer
 * @since: 17/9/29 上午10:23
 */
@Configuration
 //@ConditionalOnClass(Mongo.class)  @Configuration仅仅在一定条件下才会被加载，这里的条件是Mongo.class位于类路径上
@EnableConfigurationProperties(MongoProperties.class)
public class MongoAutoConfiguration {

    @Autowired
    private MongoProperties properties;
}
