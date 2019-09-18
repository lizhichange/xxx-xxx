package com.xxx.lz.web.dal.dataobj;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@Builder(builderMethodName = "myBuilder")
public class AyangwBlacklist implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * ayangw_blacklist.id
     *
     * @mbg.generated 2019-08-27 17:23:36
     */
    private Integer id;
    /**
     * ayangw_blacklist.type
     *
     * @mbg.generated 2019-08-27 17:23:36
     */
    private Integer type;
    /**
     * ayangw_blacklist.date
     *
     * @mbg.generated 2019-08-27 17:23:36
     */
    private Date date;
    /**
     * ayangw_blacklist.data
     *
     * @mbg.generated 2019-08-27 17:23:36
     */
    private String data;
    /**
     * ayangw_blacklist.remarks
     *
     * @mbg.generated 2019-08-27 17:23:36
     */
    private String remarks;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", type=").append(type);
        sb.append(", date=").append(date);
        sb.append(", data=").append(data);
        sb.append(", remarks=").append(remarks);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}