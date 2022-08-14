package com.boot.springbootdemo.config;

import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 引入servlet
 * @author : jieli.xu
 * @date : 2022/6/19
 */
@Configuration
@ServletComponentScan(basePackages = "com.boot.springbootdemo.servlet")
public class ServletConfig {
}
