package com.boot.springbootdemo.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Component;

/**
 * @author : jieli.xu
 * @date : 2022/6/20
 */
@Component
@MapperScan(value = "com.boot.springbootdemo.dao")
public class MyBatisConfig {
}
