package com.xxx.lz.web.dal.dataobj;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@Builder(builderMethodName = "myBuilder")
@AllArgsConstructor
@NoArgsConstructor
public class IfOrder implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * if_order.id
     *
     * @mbg.generated 2019-08-27 17:24:54
     */
    private Integer id;
    /**
     * if_order.out_trade_no
     *
     * @mbg.generated 2019-08-27 17:24:54
     */
    private String outTradeNo;
    /**
     * if_order.trade_no
     *
     * @mbg.generated 2019-08-27 17:24:54
     */
    private String tradeNo;
    /**
     * if_order.gid
     *
     * @mbg.generated 2019-08-27 17:24:54
     */
    private Integer gid;
    /**
     * if_order.money
     *
     * @mbg.generated 2019-08-27 17:24:54
     */
    private Float money;
    /**
     * if_order.rel
     *
     * @mbg.generated 2019-08-27 17:24:54
     */
    private String rel;
    /**
     * if_order.type
     *
     * @mbg.generated 2019-08-27 17:24:54
     */
    private String type;
    /**
     * if_order.benTime
     *
     * @mbg.generated 2019-08-27 17:24:54
     */
    private Date bentime;
    /**
     * if_order.endTime
     *
     * @mbg.generated 2019-08-27 17:24:54
     */
    private Date endtime;
    /**
     * if_order.number
     *
     * @mbg.generated 2019-08-27 17:24:54
     */
    private Integer number;
    /**
     * if_order.sta
     *
     * @mbg.generated 2019-08-27 17:24:54
     */
    private Integer sta;
    /**
     * if_order.sendE
     *
     * @mbg.generated 2019-08-27 17:24:54
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