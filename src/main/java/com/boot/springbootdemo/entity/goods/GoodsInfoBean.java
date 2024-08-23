package com.boot.springbootdemo.entity.goods;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @author : jieli.xu
 * @date : 2022/6/19
 */
@Data
@TableName(value = "tbl_goods_info")
public class GoodsInfoBean {
    private String id;

    private String name;

    private String description;

    private BigDecimal price;

}
