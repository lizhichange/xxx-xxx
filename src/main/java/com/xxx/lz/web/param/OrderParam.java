package com.xxx.lz.web.param;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

@Data
@ToString
public class OrderParam implements Serializable {


    private String out_trade_no;
    private String gid;
    private String money;
    private String rel;
    private String type;
    private String number;

}
