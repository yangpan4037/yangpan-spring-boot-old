package com.springboot.study.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * entity: entity 实体类
 *
 * @author: MrServer
 * @since: 17/9/26 下午5:41
 */
@Table(name = "t_test_demo")
@Entity
public class Demo {

    @Id
    @GeneratedValue
    private long id;//主键

    private String name;//测试名称.

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
