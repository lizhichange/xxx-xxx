package com.xxx.lz.web.dal.dataobj;

import java.io.Serializable;
import lombok.Builder;
import lombok.Data;

@Data
@Builder(builderMethodName="myBuilder")
public class IfConfig implements Serializable {
    /**
    *
    *
    * if_config.if_k
    
     *
     * @mbg.generated 2019-08-27 17:24:37
     */
    private String ifK;

    /**
    *
    *
    * if_config.if_v
    
     *
     * @mbg.generated 2019-08-27 17:24:37
     */
    private String ifV;

    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", ifK=").append(ifK);
        sb.append(", ifV=").append(ifV);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}