package com.xxx.lz.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BizContent {

    /**
     * out_trade_no : 20150320010101001
     * seller_id : 2088102146225135
     * total_amount : 88.88
     * discountable_amount : 8.88
     * undiscountable_amount : 80
     * buyer_logon_id : 15901825620
     * subject : Iphone6 16G
     * goods_detail : [{"goods_id":"apple-01","alipay_goods_id":"20010001","goods_name":"ipad","quantity":1,"price":2000,"goods_category":"34543238","categories_tree":"124868003|126232002|126252004","body":"特价手机","show_url":"http://www.alipay.com/xxx.jpg"}]
     * body : Iphone6 16G
     * product_code : FACE_TO_FACE_PAYMENT
     * operator_id : yx_001
     * store_id : NJ_001
     * disable_pay_channels : pcredit,moneyFund,debitCardExpress
     * enable_pay_channels : pcredit,moneyFund,debitCardExpress
     * terminal_id : NJ_T_001
     * extend_params : {"sys_service_provider_id":"2088511833207846","hb_fq_num":"3","hb_fq_seller_percent":"100","industry_reflux_info":"{\\\"scene_code\\\":\\\"metro_tradeorder\\\",\\\"channel\\\":\\\"xxxx\\\",\\\"scene_data\\\":{\\\"asset_name\\\":\\\"ALIPAY\\\"}}","card_type":"S0JP0000"}
     * timeout_express : 90m
     * royalty_info : {"royalty_type":"ROYALTY","royalty_detail_infos":[{"serial_no":1,"trans_in_type":"userId","batch_no":"123","out_relation_id":"20131124001","trans_out_type":"userId","trans_out":"2088101126765726","trans_in":"2088101126708402","amount":0.1,"desc":"分账测试1","amount_percentage":"100"}]}
     * settle_info : {"settle_detail_infos":[{"trans_in_type":"cardAliasNo","trans_in":"A0001","summary_dimension":"A0001","settle_entity_id":"2088xxxxx;ST_0001","settle_entity_type":"SecondMerchant、Store","amount":0.1}]}
     * sub_merchant : {"merchant_id":"19023454","merchant_type":"alipay: 支付宝分配的间连商户编号, merchant: 商户端的间连商户编号"}
     * alipay_store_id : 2016052600077000000015640104
     * merchant_order_no : 20161008001
     * ext_user_info : {"name":"李明","mobile":"16587658765","cert_type":"IDENTITY_CARD","cert_no":"362334768769238881","min_age":"18","fix_buyer":"F","need_check_info":"F"}
     * business_params : {"campus_card":"0000306634","card_type":"T0HK0000","actual_order_time":"2019-05-14 09:18:55"}
     * qr_code_timeout_express : 90m
     */

    private String out_trade_no;
    private String seller_id;
    private double total_amount;
    private double discountable_amount;
    private int undiscountable_amount;
    private String buyer_logon_id;
    private String subject;
    private String body;
    private String product_code;
    private String operator_id;
    private String store_id;
    private String disable_pay_channels;
    private String enable_pay_channels;
    private String terminal_id;
    private ExtendParamsBean extend_params;
    private String timeout_express;
    private RoyaltyInfoBean royalty_info;
    private SettleInfoBean settle_info;
    private SubMerchantBean sub_merchant;
    private String alipay_store_id;
    private String merchant_order_no;
    private ExtUserInfoBean ext_user_info;
    private BusinessParamsBean business_params;
    private String qr_code_timeout_express;
    private List<GoodsDetailBean> goods_detail;

    @Data

    public static class ExtendParamsBean {
        /**
         * sys_service_provider_id : 2088511833207846
         * hb_fq_num : 3
         * hb_fq_seller_percent : 100
         * industry_reflux_info : {\"scene_code\":\"metro_tradeorder\",\"channel\":\"xxxx\",\"scene_data\":{\"asset_name\":\"ALIPAY\"}}
         * card_type : S0JP0000
         */

        private String sys_service_provider_id;
        private String hb_fq_num;
        private String hb_fq_seller_percent;
        private String industry_reflux_info;
        private String card_type;


    }

    @Data

    public static class RoyaltyInfoBean {
        /**
         * royalty_type : ROYALTY
         * royalty_detail_infos : [{"serial_no":1,"trans_in_type":"userId","batch_no":"123","out_relation_id":"20131124001","trans_out_type":"userId","trans_out":"2088101126765726","trans_in":"2088101126708402","amount":0.1,"desc":"分账测试1","amount_percentage":"100"}]
         */

        private String royalty_type;
        private List<RoyaltyDetailInfosBean> royalty_detail_infos;

        @Data

        public static class RoyaltyDetailInfosBean {
            /**
             * serial_no : 1
             * trans_in_type : userId
             * batch_no : 123
             * out_relation_id : 20131124001
             * trans_out_type : userId
             * trans_out : 2088101126765726
             * trans_in : 2088101126708402
             * amount : 0.1
             * desc : 分账测试1
             * amount_percentage : 100
             */

            private int serial_no;
            private String trans_in_type;
            private String batch_no;
            private String out_relation_id;
            private String trans_out_type;
            private String trans_out;
            private String trans_in;
            private double amount;
            private String desc;
            private String amount_percentage;


        }
    }

    @Data

    public static class SettleInfoBean {
        private List<SettleDetailInfosBean> settle_detail_infos;

        @Data


        public static class SettleDetailInfosBean {
            /**
             * trans_in_type : cardAliasNo
             * trans_in : A0001
             * summary_dimension : A0001
             * settle_entity_id : 2088xxxxx;ST_0001
             * settle_entity_type : SecondMerchant、Store
             * amount : 0.1
             */

            private String trans_in_type;
            private String trans_in;
            private String summary_dimension;
            private String settle_entity_id;
            private String settle_entity_type;
            private double amount;

        }
    }

    @Data

    public static class SubMerchantBean {
        /**
         * merchant_id : 19023454
         * merchant_type : alipay: 支付宝分配的间连商户编号, merchant: 商户端的间连商户编号
         */

        private String merchant_id;
        private String merchant_type;


    }

    @Data
    public static class ExtUserInfoBean {
        /**
         * name : 李明
         * mobile : 16587658765
         * cert_type : IDENTITY_CARD
         * cert_no : 362334768769238881
         * min_age : 18
         * fix_buyer : F
         * need_check_info : F
         */

        private String name;
        private String mobile;
        private String cert_type;
        private String cert_no;
        private String min_age;
        private String fix_buyer;
        private String need_check_info;

    }

    @Data

    public static class BusinessParamsBean {
        /**
         * campus_card : 0000306634
         * card_type : T0HK0000
         * actual_order_time : 2019-05-14 09:18:55
         */

        private String campus_card;
        private String card_type;
        private String actual_order_time;


    }

    @Data

    public static class GoodsDetailBean {
        /**
         * goods_id : apple-01
         * alipay_goods_id : 20010001
         * goods_name : ipad
         * quantity : 1
         * price : 2000
         * goods_category : 34543238
         * categories_tree : 124868003|126232002|126252004
         * body : 特价手机
         * show_url : http://www.alipay.com/xxx.jpg
         */

        private String goods_id;
        private String alipay_goods_id;
        private String goods_name;
        private int quantity;
        private int price;
        private String goods_category;
        private String categories_tree;
        private String body;
        private String show_url;


    }
}
