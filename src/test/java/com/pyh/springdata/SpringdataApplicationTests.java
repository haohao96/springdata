package com.pyh.springdata;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;

@SpringBootTest
class SpringdataApplicationTests {

    @Autowired
    private DataSource dataSource;

    @Test
    void contextLoads() {
//        数据源类型：class com.zaxxer.hikari.HikariDataSource
//        在yaml中配置type后为：class com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceWrapper
        System.out.println(dataSource.getClass());
    }

}
