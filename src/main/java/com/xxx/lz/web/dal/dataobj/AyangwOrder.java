package com.xxx.lz.web.dal.dataobj;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@Builder(builderMethodName = "myBuilder")
public class AyangwOrder implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * ayangw_order.id
     *
     * @mbg.generated 2019-08-27 17:24:15
     */
    private Integer id;
    /**
     * ayangw_order.out_trade_no
     *
     * @mbg.generated 2019-08-27 17:24:15
     */
    private String outTradeNo;
    /**
     * ayangw_order.trade_no
     *
     * @mbg.generated 2019-08-27 17:24:15
     */
    private String tradeNo;
    /**
     * ayangw_order.gid
     *
     * @mbg.generated 2019-08-27 17:24:15
     */
    private Integer gid;
    /**
     * ayangw_order.money
     *
     * @mbg.generated 2019-08-27 17:24:15
     */
    private Float money;
    /**
     * ayangw_order.rel
     *
     * @mbg.generated 2019-08-27 17:24:15
     */
    private String rel;
    /**
     * ayangw_order.type
     *
     * @mbg.generated 2019-08-27 17:24:15
     */
    private String type;
    /**
     * ayangw_order.benTime
     *
     * @mbg.generated 2019-08-27 17:24:15
     */
    private Date bentime;
    /**
     * ayangw_order.endTime
     *
     * @mbg.generated 2019-08-27 17:24:15
     */
    private Date endtime;
    /**
     * ayangw_order.number
     *
     * @mbg.generated 2019-08-27 17:24:15
     */
    private Integer number;
    /**
     * ayangw_order.sta
     *
     * @mbg.generated 2019-08-27 17:24:15
     */
    private Integer sta;
    /**
     * ayangw_order.sendE
     *
     * @mbg.generated 2019-08-27 17:24:15
     */
    private Integer sende;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", outTradeNo=").append(outTradeNo);
        sb.append(", tradeNo=").append(tradeNo);
        sb.append(", gid=").append(gid);
        sb.append(", money=").append(money);
        sb.append(", rel=").append(rel);
        sb.append(", type=").append(type);
        sb.append(", bentime=").append(bentime);
        sb.append(", endtime=").append(endtime);
        sb.append(", number=").append(number);
        sb.append(", sta=").append(sta);
        sb.append(", sende=").append(sende);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}