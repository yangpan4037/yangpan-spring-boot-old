package com.springboot.study.dao;

import com.springboot.study.entity.Demo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * DemoRepository: 操作数据库
 *
 * @author: MrServer
 * @since: 17/9/26 下午5:45
 */
public interface DemoRepository extends JpaRepository<Demo,Long> {
}
