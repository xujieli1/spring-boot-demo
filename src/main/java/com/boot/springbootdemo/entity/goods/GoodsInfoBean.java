package com.boot.springbootdemo.entity.goods;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author : jieli.xu
 * @date : 2022/6/19
 */
@Data
public class GoodsInfoBean {
    private String id;

    private String name;

    private String description;

    private BigDecimal price;

}
