package com.springboot.study.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * ConfigClass:
 *
 * @author: MrServer
 * @since: 17/9/29 上午11:02
 */
@Configuration
@ImportResource(locations={"classpath:application-bean.xml"})
//@ImportResource(locations={"file:/usr/local/test/application-bean1.xml"})
public class ConfigClass {
}
