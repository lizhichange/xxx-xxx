package com.xxx.lz.web.response;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

@Data
@ToString
public class RASContent implements Serializable {


    /**
     * code : 10000
     * msg : Success
     * out_trade_no : 1567397754545
     * qr_code : https://qr.alipay.com/bax02321w9kwclbmgkd7803f
     */

    private String code;
    private String msg;
    private String out_trade_no;
    private String qr_code;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getOut_trade_no() {
        return out_trade_no;
    }

    public void setOut_trade_no(String out_trade_no) {
        this.out_trade_no = out_trade_no;
    }

    public String getQr_code() {
        return qr_code;
    }

    public void setQr_code(String qr_code) {
        this.qr_code = qr_code;
    }
}
