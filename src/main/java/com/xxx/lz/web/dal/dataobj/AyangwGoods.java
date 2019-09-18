package com.xxx.lz.web.dal.dataobj;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder(builderMethodName = "myBuilder")
public class AyangwGoods implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * ayangw_goods.id
     *
     * @mbg.generated 2019-08-27 17:23:55
     */
    private Integer id;
    /**
     * ayangw_goods.gName
     *
     * @mbg.generated 2019-08-27 17:23:55
     */
    private String gname;
    /**
     * ayangw_goods.imgs
     *
     * @mbg.generated 2019-08-27 17:23:55
     */
    private String imgs;
    /**
     * ayangw_goods.tpId
     * Ã¦â€°â‚¬Ã¥Â±Å¾Ã¥Ë†â€ Ã§Â±Â»
     *
     * @mbg.generated 2019-08-27 17:23:55
     */
    private Integer tpid;
    /**
     * ayangw_goods.price
     *
     * @mbg.generated 2019-08-27 17:23:55
     */
    private Float price;
    /**
     * ayangw_goods.state
     *
     * @mbg.generated 2019-08-27 17:23:55
     */
    private Integer state;
    /**
     * ayangw_goods.sotr
     *
     * @mbg.generated 2019-08-27 17:23:55
     */
    private Integer sotr;
    /**
     * ayangw_goods.sales
     *
     * @mbg.generated 2019-08-27 17:23:55
     */
    private Integer sales;
    /**
     * ayangw_goods.gInfo
     *
     * @mbg.generated 2019-08-27 17:23:55
     */
    private String ginfo;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", gname=").append(gname);
        sb.append(", imgs=").append(imgs);
        sb.append(", tpid=").append(tpid);
        sb.append(", price=").append(price);
        sb.append(", state=").append(state);
        sb.append(", sotr=").append(sotr);
        sb.append(", sales=").append(sales);
        sb.append(", ginfo=").append(ginfo);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}