package com.boot.springbootdemo.entity;

import lombok.Data;

/**
 * @author : jieli.xu
 * @date : 2022/6/3
 */
@Data
public class DownloadDataVO {
    private String name;

    private int age;

    public DownloadDataVO(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public DownloadDataVO() {
    }
}
