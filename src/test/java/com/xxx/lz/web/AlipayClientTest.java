package com.xxx.lz.web;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipayTradePrecreateRequest;
import com.alipay.api.response.AlipayTradePrecreateResponse;
import org.junit.Test;

public class AlipayClientTest {

    private static final String APP_PRIVATE_KEY = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQCqhZaDNlD8ShqATWQItzzSjcm22CAiRIpMW+0nYw9Urw7omFh3lK4BtTbS+Si/LkDA9FXoNzY//G4g9Ay9OpSYi0y2ExleLz7Lk/nd45Xfz5WmRjp76bOuiFNSkLDbVJ2kKTCee+OcmNfvwF9A3ES2F/W1yMLxl4nInDw2oBA+bmQ/nCGmyG+ErrAJc34wjvkhW4fPD3MvcnpQuw6P9UMqHshKxSJzKXh9MFHl6cOKHq5mwehjiV9I2DYyzsp//e579dNe9/wmx4rA+hVcKD9AT8BP8TDknNOqwKj9TssFFAsvlNSTFpVrXWc9DFGO22HUu5Vff6WlD2zPqFT0UTLXAgMBAAECggEBAKYIlNkF1i0Q6mTq9fAWmr5ZGINURVWYbyCSkYO8TH0kRtvrGpi0yAkZrVwXBrnAC4TVY6BLwiLjY0fq2UyW8YDmgbb3OcgfMIGAf9axdokJ0qin0OI+V5olWxwVjl7BMQ1aneByuNkNaZQkN5sr3it/gNuTs10RNDOFDIwTpj1iGMlLiyPg57QT7S0Et4XESI9Wore91nWG0t3BTtKZoIrJrCsLN3kh3+x4i2b+AulGRQNkwyTa2zbvEuTSu9Mq3pTAQcOiYJaRhbLaRwegIJV9gnWZAYxJ7Mz7jmDCLGM6daZphyFYEpOSfmzLRj6u+gZ0G11OM+nd7YYIyNvGQqECgYEA/f8dlq7tnBTql5Xf4vu4Io46PCeC2yIplL0/f9OwuQuuYa9FveT+29oUkNF7C2K17cWRyOzftWnTxt7+WXx/jib/Nl4bmPP8lQx5MrTfEMonvAWWJ49Ijw7h3zPbRPMEf/Feo0Viynz+boEVSMoF5gZQwNKiNoKgKeLjyNF6IEUCgYEAq93qWISvLewmGz1o70yrhILcipTyxfceVpPmMEAPorOSgVKxuPpZ0Xysc6d7mPoq5cnDmhr2HKITwKebGSHDiE6MlGsoFLlfJ28E+lTWy/ERqc3hTmk60BhQfBn5PWtmVuCxOEXDHjebF5yeO7Xv8UgcOV5m+CDvUe3ZhoRxPmsCgYEAv7sXW8qaZIrJdznUcmQvYC5auVPeDIqiNrwQte5XZafyr5x+GdVFqTHa+mKW7kZKLL1JyhE84ZWMHn/wIh6/rs+zMRgi3ve2f9CVoHg2NldTXTQeX6hiTlMen71mVIrZp7bNCJR0+YMXENVx+qs9fqDfzl5xwpIiUtwJtGqkNL0CgYBitL3tfq65eiHcjSViIi9zmFCfSrIvniCParvOREx2jhl7KooliariFG9asPrcPfk7Jeiv7gIhKbicceYyxeBtvWchqnVHibsrg6hhOS5vzJDva+2VQfxkHULEM4qgirko9jzx66cHCLqLEgkSlAgtE9QZ4qzSnt+ztx2yEwiS5wKBgDLSNyBl9O1XF/3R0mpSclxQ6OKadhDi1pxvjA/DDUHAvmDpT6XQuiDBN6swpvWxw7Bi8QmDVa2fmHjqLlqST113d56bDOV+Q18OMBBZfRVW7yh6pJdRJJeEst/xQLVkyWrPF9T/ZiehfPCxPxEDSmTSHf4RzNvaTZkRRWoX/JQh";


//    private static final String ALIPAY_PUBLIC_KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAqoWWgzZQ/EoagE1kCLc80o3JttggIkSKTFvtJ2MPVK8O6JhYd5SuAbU20vkovy5AwPRV6Dc2P/xuIPQMvTqUmItMthMZXi8+y5P53eOV38+VpkY6e+mzrohTUpCw21SdpCkwnnvjnJjX78BfQNxEthf1tcjC8ZeJyJw8NqAQPm5kP5whpshvhK6wCXN+MI75IVuHzw9zL3J6ULsOj/VDKh7ISsUicyl4fTBR5enDih6uZsHoY4lfSNg2Ms7Kf/3ue/XTXvf8JseKwPoVXCg/QE/AT/Ew5JzTqsCo/U7LBRQLL5TUkxaVa11nPQxRjtth1LuVX3+lpQ9sz6hU9FEy1wIDAQAB";
    private static final String ALIPAY_PUBLIC_KEY = "";
    private static final String APP_ID = "2019082966724031";
    private static final String CHARSET = "UTF-8";


    @Test
    public void test02()   {

        long l = System.currentTimeMillis();
        AlipayClient alipayClient = new DefaultAlipayClient("https://openapi.alipay.com/gateway.do", APP_ID, APP_PRIVATE_KEY, "json", CHARSET, ALIPAY_PUBLIC_KEY, "RSA2"); //获得初始化的AlipayClient
        AlipayTradePrecreateRequest request = new AlipayTradePrecreateRequest();//创建API对应的request类
        request.setBizContent("{" +
                "    \"out_trade_no\":\"" + l + "\"," +//商户订单号
                "    \"total_amount\":\"88.88\"," +
                "    \"subject\":\"Iphone6 16G\"," +
                "    \"store_id\":\"NJ_001\"}");//订单允许的最晚付款时间
        AlipayTradePrecreateResponse response;
        try {
            response = alipayClient.execute(request);
            System.out.print(response.getBody());
        } catch (AlipayApiException e) {
            e.printStackTrace();
        }

    }


    @Test
    public void test01() throws AlipayApiException {

        String bizContent = "" +
                "\"out_trade_no\":\"20150320010101001\"," +
                "\"seller_id\":\"2088102146225135\"," +
                "\"total_amount\":88.88," +
                "\"discountable_amount\":8.88," +
                "\"undiscountable_amount\":80," +
                "\"buyer_logon_id\":\"15901825620\"," +
                "\"subject\":\"Iphone6 16G\"," +
                "      \"goods_detail\":[{" +
                "        \"goods_id\":\"apple-01\"," +
                "\"alipay_goods_id\":\"20010001\"," +
                "\"goods_name\":\"ipad\"," +
                "\"quantity\":1," +
                "\"price\":2000," +
                "\"goods_category\":\"34543238\"," +
                "\"categories_tree\":\"124868003|126232002|126252004\"," +
                "\"body\":\"特价手机\"," +
                "\"show_url\":\"http://www.alipay.com/xxx.jpg\"" +
                "        }]," +
                "\"body\":\"Iphone6 16G\"," +
                "\"product_code\":\"FACE_TO_FACE_PAYMENT\"," +
                "\"operator_id\":\"yx_001\"," +
                "\"store_id\":\"NJ_001\"," +
                "\"disable_pay_channels\":\"pcredit,moneyFund,debitCardExpress\"," +
                "\"enable_pay_channels\":\"pcredit,moneyFund,debitCardExpress\"," +
                "\"terminal_id\":\"NJ_T_001\"," +
                "\"extend_params\":{" +
                "\"sys_service_provider_id\":\"2088511833207846\"," +
                "\"hb_fq_num\":\"3\"," +
                "\"hb_fq_seller_percent\":\"100\"," +
                "\"industry_reflux_info\":\"{\\\\\\\"scene_code\\\\\\\":\\\\\\\"metro_tradeorder\\\\\\\",\\\\\\\"channel\\\\\\\":\\\\\\\"xxxx\\\\\\\",\\\\\\\"scene_data\\\\\\\":{\\\\\\\"asset_name\\\\\\\":\\\\\\\"ALIPAY\\\\\\\"}}\"," +
                "\"card_type\":\"S0JP0000\"" +
                "    }," +
                "\"timeout_express\":\"90m\"," +
                "\"royalty_info\":{" +
                "\"royalty_type\":\"ROYALTY\"," +
                "        \"royalty_detail_infos\":[{" +
                "          \"serial_no\":1," +
                "\"trans_in_type\":\"userId\"," +
                "\"batch_no\":\"123\"," +
                "\"out_relation_id\":\"20131124001\"," +
                "\"trans_out_type\":\"userId\"," +
                "\"trans_out\":\"2088101126765726\"," +
                "\"trans_in\":\"2088101126708402\"," +
                "\"amount\":0.1," +
                "\"desc\":\"分账测试1\"," +
                "\"amount_percentage\":\"100\"" +
                "          }]" +
                "    }," +
                "\"settle_info\":{" +
                "        \"settle_detail_infos\":[{" +
                "          \"trans_in_type\":\"cardAliasNo\"," +
                "\"trans_in\":\"A0001\"," +
                "\"summary_dimension\":\"A0001\"," +
                "\"settle_entity_id\":\"2088xxxxx;ST_0001\"," +
                "\"settle_entity_type\":\"SecondMerchant、Store\"," +
                "\"amount\":0.1" +
                "          }]" +
                "    }," +
                "\"sub_merchant\":{" +
                "\"merchant_id\":\"19023454\"," +
                "\"merchant_type\":\"alipay: 支付宝分配的间连商户编号, merchant: 商户端的间连商户编号\"" +
                "    }," +
                "\"alipay_store_id\":\"2016052600077000000015640104\"," +
                "\"merchant_order_no\":\"20161008001\"," +
                "\"ext_user_info\":{" +
                "\"name\":\"李明\"," +
                "\"mobile\":\"16587658765\"," +
                "\"cert_type\":\"IDENTITY_CARD\"," +
                "\"cert_no\":\"362334768769238881\"," +
                "\"min_age\":\"18\"," +
                "\"fix_buyer\":\"F\"," +
                "\"need_check_info\":\"F\"" +
                "    }," +
                "\"business_params\":{" +
                "\"campus_card\":\"0000306634\"," +
                "\"card_type\":\"T0HK0000\"," +
                "\"actual_order_time\":\"2019-05-14 09:18:55\"" +
                "    }," +
                "\"qr_code_timeout_express\":\"90m\"" +
                "  }";
        System.out.println(bizContent);


        AlipayClient alipayClient = new DefaultAlipayClient("https://openapi.alipay.com/gateway.do",
                APP_ID, APP_PRIVATE_KEY, "json", CHARSET, ALIPAY_PUBLIC_KEY, "RSA2");
//实例化具体API对应的request类,类名称和接口名称对应,当前调用接口名称：alipay.open.public.template.message.industry.modify
        AlipayTradePrecreateRequest request = new AlipayTradePrecreateRequest();

        request.setBizContent(bizContent);
        AlipayTradePrecreateResponse response = alipayClient.execute(request);
        if (response.isSuccess()) {
            System.out.println("调用成功");
        } else {
            System.out.println("调用失败");
        }

    }
}
