package com.boot.springbootdemo.config;

import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.stereotype.Component;

/**
 *
 * 引入filter
 *
 * @author : jieli.xu
 * @date : 2022/6/19
 */
@Component
@ServletComponentScan(basePackages="com.boot.springbootdemo.filter")
public class FilterConfig {
}
