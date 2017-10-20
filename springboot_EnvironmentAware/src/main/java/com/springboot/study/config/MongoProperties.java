package com.springboot.study.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * MongoProperties:
 *
 * @author: MrServer
 * @since: 17/9/29 上午10:26
 */
@ConfigurationProperties(prefix = "spring.data.mongodb")
public class MongoProperties {

    private String host;
    private String uri = "mongodb://localhost/test";
    private String database;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }
}
