package com.boot.springbootdemo.controller;


import com.boot.springbootdemo.dao.GoodsInfoMapper;
import com.boot.springbootdemo.entity.ResultDTO;
import com.boot.springbootdemo.entity.ResultVO;
import com.boot.springbootdemo.entity.goods.GoodsInfoBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

/**
 * @author : jieli.xu
 * @date : 2022/6/2
 */
@RestController
@RequestMapping("/file")
@Component
public class FileStreamController {
    @Autowired
    private GoodsInfoMapper goodsInfoMapper;

    @RequestMapping(value = "getTest", method = RequestMethod.POST)
    public ResultVO getTest(ResultDTO resultDTO) throws IOException {
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(resultDTO.getName());
        resultVO.setMessage(resultDTO.getName());
        return resultVO;
    }



    @RequestMapping(value = "testMybatis",method = RequestMethod.GET)
    public ResultVO testMybatis(){
        List<GoodsInfoBean> listBean = goodsInfoMapper.selectById(1008L);
        listBean.forEach(e ->{
            System.out.println(e.getDescription());
        });
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(listBean.get(0).getDescription());
        resultVO.setMessage(listBean.get(0).getName());
        return resultVO;
    }

}
