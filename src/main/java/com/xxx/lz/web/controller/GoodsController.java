package com.xxx.lz.web.controller;

import com.google.common.collect.Lists;
import com.xxx.lz.web.dal.dao.IfGoodsMapper;
import com.xxx.lz.web.dal.dao.IfOrderMapper;
import com.xxx.lz.web.dal.dataobj.IfGoods;
import com.xxx.lz.web.dal.dataobj.IfGoodsExample;
import com.xxx.lz.web.dal.dataobj.IfOrder;
import com.xxx.lz.web.param.GoodsParam;
import com.xxx.lz.web.param.OrderParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

/**
 * @author lizhi
 * @date 2018-7-5
 */
@RestController
@RequestMapping("/goods")
public class GoodsController {

    @Autowired
    private IfGoodsMapper ifGoodsMapper;

    @Autowired
    private IfOrderMapper ifOrderMapper;


    @PostMapping("/goods")
    List<IfGoods> good(@RequestBody GoodsParam param) {
        IfGoodsExample example = new IfGoodsExample();
        IfGoodsExample.Criteria criteria = example.createCriteria();
        criteria.andStateEqualTo(1);
        criteria.andTpidEqualTo(Integer.parseInt((param.getTyid())));
        example.setOrderByClause(" sotr desc ");
        List<IfGoods> ifGoods = ifGoodsMapper.selectByExample(example);
        if (CollectionUtils.isEmpty(ifGoods)) {
            return Lists.newArrayList();
        }
        return ifGoods;
    }

    @PostMapping("/order")
    String order(@RequestBody OrderParam orderParam) {
        IfOrder order = new IfOrder();
        order.setOutTradeNo(orderParam.getOut_trade_no());
        order.setGid(Integer.valueOf(orderParam.getGid()));
        order.setMoney(Float.valueOf(orderParam.getMoney()));
        order.setRel(orderParam.getRel());
        order.setType(orderParam.getType());
        order.setBentime(new Date());
        order.setEndtime(new Date());
        order.setNumber(Integer.valueOf(orderParam.getNumber()));
        int i = ifOrderMapper.insertSelective(order);
        if (i > 0) {
            return "ok";
        }
        return "fail";
    }
}