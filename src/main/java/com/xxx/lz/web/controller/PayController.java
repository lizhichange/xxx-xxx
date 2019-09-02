package com.xxx.lz.web.controller;


import cn.hutool.json.JSONUtil;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipayTradePrecreateRequest;
import com.alipay.api.response.AlipayTradePrecreateResponse;
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

import java.util.List;

@Controller
@RequestMapping("other")
public class PayController {

    private static final String APP_PRIVATE_KEY = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQCqhZaDNlD8ShqATWQItzzSjcm22CAiRIpMW+0nYw9Urw7omFh3lK4BtTbS+Si/LkDA9FXoNzY//G4g9Ay9OpSYi0y2ExleLz7Lk/nd45Xfz5WmRjp76bOuiFNSkLDbVJ2kKTCee+OcmNfvwF9A3ES2F/W1yMLxl4nInDw2oBA+bmQ/nCGmyG+ErrAJc34wjvkhW4fPD3MvcnpQuw6P9UMqHshKxSJzKXh9MFHl6cOKHq5mwehjiV9I2DYyzsp//e579dNe9/wmx4rA+hVcKD9AT8BP8TDknNOqwKj9TssFFAsvlNSTFpVrXWc9DFGO22HUu5Vff6WlD2zPqFT0UTLXAgMBAAECggEBAKYIlNkF1i0Q6mTq9fAWmr5ZGINURVWYbyCSkYO8TH0kRtvrGpi0yAkZrVwXBrnAC4TVY6BLwiLjY0fq2UyW8YDmgbb3OcgfMIGAf9axdokJ0qin0OI+V5olWxwVjl7BMQ1aneByuNkNaZQkN5sr3it/gNuTs10RNDOFDIwTpj1iGMlLiyPg57QT7S0Et4XESI9Wore91nWG0t3BTtKZoIrJrCsLN3kh3+x4i2b+AulGRQNkwyTa2zbvEuTSu9Mq3pTAQcOiYJaRhbLaRwegIJV9gnWZAYxJ7Mz7jmDCLGM6daZphyFYEpOSfmzLRj6u+gZ0G11OM+nd7YYIyNvGQqECgYEA/f8dlq7tnBTql5Xf4vu4Io46PCeC2yIplL0/f9OwuQuuYa9FveT+29oUkNF7C2K17cWRyOzftWnTxt7+WXx/jib/Nl4bmPP8lQx5MrTfEMonvAWWJ49Ijw7h3zPbRPMEf/Feo0Viynz+boEVSMoF5gZQwNKiNoKgKeLjyNF6IEUCgYEAq93qWISvLewmGz1o70yrhILcipTyxfceVpPmMEAPorOSgVKxuPpZ0Xysc6d7mPoq5cnDmhr2HKITwKebGSHDiE6MlGsoFLlfJ28E+lTWy/ERqc3hTmk60BhQfBn5PWtmVuCxOEXDHjebF5yeO7Xv8UgcOV5m+CDvUe3ZhoRxPmsCgYEAv7sXW8qaZIrJdznUcmQvYC5auVPeDIqiNrwQte5XZafyr5x+GdVFqTHa+mKW7kZKLL1JyhE84ZWMHn/wIh6/rs+zMRgi3ve2f9CVoHg2NldTXTQeX6hiTlMen71mVIrZp7bNCJR0+YMXENVx+qs9fqDfzl5xwpIiUtwJtGqkNL0CgYBitL3tfq65eiHcjSViIi9zmFCfSrIvniCParvOREx2jhl7KooliariFG9asPrcPfk7Jeiv7gIhKbicceYyxeBtvWchqnVHibsrg6hhOS5vzJDva+2VQfxkHULEM4qgirko9jzx66cHCLqLEgkSlAgtE9QZ4qzSnt+ztx2yEwiS5wKBgDLSNyBl9O1XF/3R0mpSclxQ6OKadhDi1pxvjA/DDUHAvmDpT6XQuiDBN6swpvWxw7Bi8QmDVa2fmHjqLlqST113d56bDOV+Q18OMBBZfRVW7yh6pJdRJJeEst/xQLVkyWrPF9T/ZiehfPCxPxEDSmTSHf4RzNvaTZkRRWoX/JQh";
    private static final Logger LOGGER = LoggerFactory.getLogger(PayController.class);

    //    private static final String ALIPAY_PUBLIC_KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAqoWWgzZQ/EoagE1kCLc80o3JttggIkSKTFvtJ2MPVK8O6JhYd5SuAbU20vkovy5AwPRV6Dc2P/xuIPQMvTqUmItMthMZXi8+y5P53eOV38+VpkY6e+mzrohTUpCw21SdpCkwnnvjnJjX78BfQNxEthf1tcjC8ZeJyJw8NqAQPm5kP5whpshvhK6wCXN+MI75IVuHzw9zL3J6ULsOj/VDKh7ISsUicyl4fTBR5enDih6uZsHoY4lfSNg2Ms7Kf/3ue/XTXvf8JseKwPoVXCg/QE/AT/Ew5JzTqsCo/U7LBRQLL5TUkxaVa11nPQxRjtth1LuVX3+lpQ9sz6hU9FEy1wIDAQAB";
    private static final String ALIPAY_PUBLIC_KEY = "";
    private static final String APP_ID = "2019082966724031";
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
        example.createCriteria().andIfKEqualTo("epay_id");
        List<IfConfig> ifConfigs = ifConfigMapper.selectByExampleWithBLOBs(example);
        if (CollectionUtils.isEmpty(ifConfigs)) {
            return "";
        }
        IfConfig ifConfig = ifConfigs.get(0);


        BizContent bizContent = new BizContent();

        bizContent.setOut_trade_no(out_trade_no);
        bizContent.setTotal_amount(Double.parseDouble(money));
        bizContent.setSubject(name);
        long l = System.currentTimeMillis();
        AlipayClient alipayClient = new DefaultAlipayClient("https://openapi.alipay.com/gateway.do", APP_ID, APP_PRIVATE_KEY,
                "json", CHARSET, ALIPAY_PUBLIC_KEY, "RSA2"); //获得初始化的AlipayClient

        AlipayTradePrecreateRequest request = new AlipayTradePrecreateRequest();//创建API对应的request类
        request.setBizContent("{" +
                "    \"out_trade_no\":\"" + out_trade_no + "\"," +//商户订单号
                "    \"total_amount\":\"" + money + "\"," +
                "    \"subject\":\"" + name + "\"," +
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

