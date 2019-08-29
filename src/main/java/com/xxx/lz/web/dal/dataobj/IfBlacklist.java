package com.xxx.lz.web.dal.dataobj;

import java.io.Serializable;
import java.util.Date;
import lombok.Builder;
import lombok.Data;

@Data
@Builder(builderMethodName="myBuilder")
public class IfBlacklist implements Serializable {
    /**
    *
    *
    * if_blacklist.id
    
     *
     * @mbg.generated 2019-08-27 17:24:32
     */
    private Integer id;

    /**
    *
    *
    * if_blacklist.type
    
     *
     * @mbg.generated 2019-08-27 17:24:32
     */
    private Integer type;

    /**
    *
    *
    * if_blacklist.date
    
     *
     * @mbg.generated 2019-08-27 17:24:32
     */
    private Date date;

    /**
    *
    *
    * if_blacklist.data
    
     *
     * @mbg.generated 2019-08-27 17:24:32
     */
    private String data;

    /**
    *
    *
    * if_blacklist.remarks
    
     *
     * @mbg.generated 2019-08-27 17:24:32
     */
    private String remarks;

    private static final long serialVersionUID = 1L;

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