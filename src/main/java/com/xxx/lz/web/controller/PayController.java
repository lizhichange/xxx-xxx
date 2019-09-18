package com.xxx.lz.web.controller;


import cn.hutool.json.JSONUtil;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipayTradePrecreateRequest;
import com.alipay.api.response.AlipayTradePrecreateResponse;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.xxx.lz.web.dal.dao.IfConfigMapper;
import com.xxx.lz.web.dal.dataobj.IfConfig;
import com.xxx.lz.web.dal.dataobj.IfConfigExample;
import com.xxx.lz.web.model.BizContent;
import com.xxx.lz.web.response.RASContent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.List;

@Controller
@RequestMapping("other")
public class PayController {

    private static final Logger LOGGER = LoggerFactory.getLogger(PayController.class);

    private static final String ALIPAY_PUBLIC_KEY = "";
    private static final String CHARSET = "UTF-8";
    @Autowired
    private IfConfigMapper ifConfigMapper;

    @GetMapping("/submit")
    String submit(
            ModelMap modelMap,
            @RequestParam(value = "type", required = false) String type,
            @RequestParam(value = "name", required = false) String name,
            @RequestParam(value = "money", required = false) String money,
            @RequestParam(value = "number", required = false) String number,
            @RequestParam(value = "out_trade_no", required = false) String out_trade_no,
            @RequestParam(value = "gid", required = false) String gid

    ) {
        IfConfigExample example = new IfConfigExample();
        example.createCriteria().andIfKIn(Lists.newArrayList("epay_id", "APP_ID", "APP_PRIVATE_KEY"));
        List<IfConfig> ifConfigs = ifConfigMapper.selectByExampleWithBLOBs(example);
        if (CollectionUtils.isEmpty(ifConfigs)) {
            return "";
        }
        HashMap<String, String> hashMap = Maps.newHashMap();

        for (IfConfig ifConfig : ifConfigs) {
            hashMap.put(ifConfig.getIfK(), ifConfig.getIfV());
        }

        BizContent bizContent = new BizContent();

        bizContent.setOut_trade_no(out_trade_no);
        bizContent.setTotal_amount(Double.parseDouble(money));
        bizContent.setSubject(name);
        long l = System.currentTimeMillis();
        AlipayClient alipayClient = new DefaultAlipayClient("https://openapi.alipay.com/gateway.do", hashMap.get("APP_ID"), hashMap.get("APP_PRIVATE_KEY"),
                "json", CHARSET, ALIPAY_PUBLIC_KEY, "RSA2"); //获得初始化的AlipayClient
        String timeout_express = "6m";
        AlipayTradePrecreateRequest request = new AlipayTradePrecreateRequest();//创建API对应的request类
        request.setBizContent("{" +
                "    \"out_trade_no\":\"" + out_trade_no + "\"," +//商户订单号
                "    \"total_amount\":\"" + money + "\"," +
                "    \"subject\":\"" + name + "\"," +
                "    \"timeout_express\":\"" + timeout_express + "\"," +
                "    \"store_id\":\"NJ_001\"}");//订单允许的最晚付款时间

        AlipayTradePrecreateResponse response;
        String message = null;
        try {
            response = alipayClient.execute(request);
            System.out.print(response.getBody());
        } catch (Exception e) {
            LOGGER.error(e.getMessage(), e);
            message = e.getCause().getMessage();
        }

        assert message != null;
        String substring = message.substring(message.indexOf("{"), message.lastIndexOf("}") + 1);
        LOGGER.info("result:{}", substring);
        RASContent rasContent = JSONUtil.toBean(substring, RASContent.class);
        modelMap.addAttribute("rasContent", rasContent);
        modelMap.addAttribute("amount", money);
        modelMap.addAttribute("orderId", out_trade_no);
        return "other/submit";
    }


}

