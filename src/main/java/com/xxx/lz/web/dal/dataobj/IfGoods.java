package com.xxx.lz.web.dal.dataobj;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder(builderMethodName = "myBuilder")
@NoArgsConstructor
@AllArgsConstructor
public class IfGoods implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * if_goods.id
     *
     * @mbg.generated 2019-08-27 17:24:43
     */
    private Integer id;
    /**
     * if_goods.gName
     *
     * @mbg.generated 2019-08-27 17:24:43
     */
    private String gname;
    /**
     * if_goods.imgs
     *
     * @mbg.generated 2019-08-27 17:24:43
     */
    private String imgs;
    /**
     * if_goods.tpId
     * Ã¦â€°â‚¬Ã¥Â±Å¾Ã¥Ë†â€ Ã§Â±Â»
     *
     * @mbg.generated 2019-08-27 17:24:43
     */
    private Integer tpid;
    /**
     * if_goods.price
     *
     * @mbg.generated 2019-08-27 17:24:43
     */
    private Float price;
    /**
     * if_goods.state
     *
     * @mbg.generated 2019-08-27 17:24:43
     */
    private Integer state;
    /**
     * if_goods.sotr
     *
     * @mbg.generated 2019-08-27 17:24:43
     */
    private Integer sotr;
    /**
     * if_goods.sales
     *
     * @mbg.generated 2019-08-27 17:24:43
     */
    private Integer sales;
    /**
     * if_goods.gInfo
     *
     * @mbg.generated 2019-08-27 17:24:43
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