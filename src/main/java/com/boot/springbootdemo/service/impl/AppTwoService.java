package com.boot.springbootdemo.service.impl;

/**
 * @author : jieli.xu
 * @date : 2022/6/12
 */
public interface AppTwoService {
    /**
     * 从 APP two 获取应用服务
     * @param name ：
     * @return ：
     */
    String getAppTwoInfo(String name);

    String getAppTwoInfoByRequestMapping(String name);
}
