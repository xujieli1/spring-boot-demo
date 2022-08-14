package com.boot.springbootdemo.dao;

import com.boot.springbootdemo.entity.goods.GoodsInfoBean;
import org.apache.ibatis.annotations.Param;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface GoodsInfoMapper extends BaseMapper<GoodsInfoBean> {


    List<GoodsInfoBean> selectById(@Param("id") Long id);

}
