package com.xxx.lz.web.dal.dataobj;

import java.io.Serializable;
import java.util.Date;
import lombok.Builder;
import lombok.Data;

@Data
@Builder(builderMethodName="myBuilder")
public class AyangwKm implements Serializable {
    /**
    *
    *
    * ayangw_km.id
    
     *
     * @mbg.generated 2019-08-27 17:24:05
     */
    private Integer id;

    /**
    *
    *
    * ayangw_km.gid
    
     *
     * @mbg.generated 2019-08-27 17:24:05
     */
    private Integer gid;

    /**
    *
    *
    * ayangw_km.km
    
     *
     * @mbg.generated 2019-08-27 17:24:05
     */
    private String km;

    /**
    *
    *
    * ayangw_km.benTime
    
     *
     * @mbg.generated 2019-08-27 17:24:05
     */
    private Date bentime;

    /**
    *
    *
    * ayangw_km.endTime
    
     *
     * @mbg.generated 2019-08-27 17:24:05
     */
    private Date endtime;

    /**
    *
    *
    * ayangw_km.out_trade_no
    
     *
     * @mbg.generated 2019-08-27 17:24:05
     */
    private String outTradeNo;

    /**
    *
    *
    * ayangw_km.trade_no
    
     *
     * @mbg.generated 2019-08-27 17:24:05
     */
    private String tradeNo;

    /**
    *
    *
    * ayangw_km.rel
    
     *
     * @mbg.generated 2019-08-27 17:24:05
     */
    private String rel;

    /**
    *
    *
    * ayangw_km.stat
    
     *
     * @mbg.generated 2019-08-27 17:24:05
     */
    private Integer stat;

    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", gid=").append(gid);
        sb.append(", km=").append(km);
        sb.append(", bentime=").append(bentime);
        sb.append(", endtime=").append(endtime);
        sb.append(", outTradeNo=").append(outTradeNo);
        sb.append(", tradeNo=").append(tradeNo);
        sb.append(", rel=").append(rel);
        sb.append(", stat=").append(stat);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}